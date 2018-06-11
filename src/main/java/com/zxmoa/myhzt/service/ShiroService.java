package com.zxmoa.myhzt.service;

import com.zxmoa.myhzt.bean.common.UserOnline;
import com.zxmoa.myhzt.bean.generator.Menu;
import com.zxmoa.myhzt.bean.generator.Role;
import com.zxmoa.myhzt.bean.generator.User;
import com.zxmoa.myhzt.common.annotation.Log;
import com.zxmoa.myhzt.dao.ShiroDao;
import com.zxmoa.myhzt.utils.MyString;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.DefaultSessionManager;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
/**
 * 这个service是不会受aop控制的，因为他被注入到了realm中
 */
public class ShiroService {

    @Autowired
    private ShiroDao shiroDao;
    @Autowired

    private SessionDAO sessionDAO;

    @Log(value = "用户登入")
    public void login(String account, String password) {
        UsernamePasswordToken token = new UsernamePasswordToken(account, password);
        token.isRememberMe();
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.login(token);
        //注销其他session---保证一个账号只有一个人登入
        List<Session> loginedList = getLoginedSession(currentUser);
        for (Session session : loginedList) {
            session.stop();
        }
    }

    /**
     * 根据用户账号查询用户所有信息
     *
     * @param account
     * @return
     */
    @Log(value = "根据账号查询用户所有信息")
    public List<User> select_userbyaccount(String account) {
        return shiroDao.select_userbyaccount(account);
    }

    @Log(value = "根据账号查询用户所有角色")
    public List<Role> select_UserRole(String account) {
        return shiroDao.select_UserRole(account);
    }

    @Log(value = "查询这个人的所有权限点")
    public Set<String> select_UserPermissions(Set<String> roleid, String account) {
        //根据角色id集合查询权限点（菜单）集合
        List<Menu> permissionList = select_Userrolepermission(roleid);
        Set<String> permissionSet = new HashSet<String>();
        for (Menu m : permissionList) {
            if (!MyString.Object2String(m.getPerms()).equals("")) {
                permissionSet.add(m.getPerms());
            }
        }
        //再去查询这个人另外加上去的权限点
        List<Menu> permissionList2 = select_Userexp(account);
        for (Menu m : permissionList2) {
            if (!MyString.Object2String(m.getPerms()).equals("")) {
                permissionSet.add(m.getPerms());
            }
        }
        return permissionSet;

    }

    @Log(value = "根据账号获取他额外的权限点")
    public List<Menu> select_Userexp(String account) {
        return shiroDao.select_Userexp(account);
    }

    @Log(value = "根据角色id查询权限点集合")
    public List<Menu> select_Userrolepermission(Set<String> roleid) {
        return shiroDao.select_UserPermissions(roleid);
    }

    @Log(value = "根据账号查询所有菜单")
    public List<Menu> getMenu(String account) {
        List<Role> roleList = select_UserRole(account);
        Set<String> roleid = new HashSet<String>();
        for (Role r : roleList) {
            roleid.add(r.getRoleid());
        }
        List<Menu> permissionList = select_Userrolepermission(roleid);
        List<Menu> permissionList2 = select_Userexp(account);
        //去重合并
        permissionList.removeAll(permissionList2);
        permissionList2.addAll(permissionList);
        return permissionList2;
    }

    @Log(value = "获取在线人员")
    public List<UserOnline> select_UserOnline() {
        List<UserOnline> list = new ArrayList<>();
        //获取所有在线人员的session
        Collection<Session> sessions = sessionDAO.getActiveSessions();
        for (Session session : sessions) {
            UserOnline userOnline = new UserOnline();
            User user = new User();
            SimplePrincipalCollection principalCollection = new SimplePrincipalCollection();
            if (session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY) == null) {
                continue;
            } else {
                principalCollection = (SimplePrincipalCollection) session
                        .getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
                //如果SimpleAuthenticationInfo中填的是account的话，将没法实现强转
                user = (User) principalCollection.getPrimaryPrincipal();
                userOnline.setUsername(user.getUsername());
                userOnline.setUserId(user.getUserid());
            }
            userOnline.setId((String) session.getId());
            userOnline.setHost(session.getHost());
            userOnline.setStartTimestamp(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(session.getStartTimestamp()));
            userOnline.setLastAccessTime(new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(session.getLastAccessTime()));
            Long timeout = session.getTimeout();
            if (timeout > 0) {
                userOnline.setTimeout(timeout);
                list.add(userOnline);
            }
        }
        return list;
    }


    @Log(value = "将人踢下线")
    public void forceLogout(String sessionId) {
        Session session = sessionDAO.readSession(sessionId);
        session.setTimeout(0);
    }


    //获取同一个账户的session集合
    private List<Session> getLoginedSession(Subject currentUser) {
        Collection<Session> list = ((DefaultSessionManager) ((DefaultSecurityManager) SecurityUtils
                .getSecurityManager()).getSessionManager()).getSessionDAO()
                .getActiveSessions();
        List<Session> loginedList = new ArrayList<>();
        User loginUser = (User) currentUser.getPrincipal();
        for (Session session : list) {
            Subject s = new Subject.Builder().session(session).buildSubject();
            if (s.isAuthenticated()) {
                User user = (User) s.getPrincipal();
                //如果账号相等的话
                if (user.getAccount().equals(loginUser.getAccount())) {
                    //并且两个sessionid不一样
                    if (!session.getId().equals(currentUser.getSession().getId())) {
                        loginedList.add(session);
                    }
                }
            }
        }
        return loginedList;
    }
}
