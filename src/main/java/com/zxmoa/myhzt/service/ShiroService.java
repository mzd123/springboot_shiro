package com.zxmoa.myhzt.service;

import com.zxmoa.myhzt.bean.generator.Menu;
import com.zxmoa.myhzt.bean.generator.Role;
import com.zxmoa.myhzt.bean.generator.User;
import com.zxmoa.myhzt.common.annotation.Log;
import com.zxmoa.myhzt.dao.ShiroDao;
import com.zxmoa.myhzt.utils.MyString;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
/**
 * 这个service是不会受aop控制的，因为他被注入到了realm中
 */
public class ShiroService {

    @Autowired
    private ShiroDao shiroDao;

    @Log(value = "用户登入")
    public void login(String account, String password) {
        UsernamePasswordToken token = new UsernamePasswordToken(account, password);
        token.isRememberMe();
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.login(token);
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
}
