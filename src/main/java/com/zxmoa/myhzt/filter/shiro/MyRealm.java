package com.zxmoa.myhzt.filter.shiro;

import com.zxmoa.myhzt.bean.generator.Menu;
import com.zxmoa.myhzt.bean.generator.Role;
import com.zxmoa.myhzt.bean.generator.User;
import com.zxmoa.myhzt.service.ShiroService;
import com.zxmoa.myhzt.utils.MyString;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MyRealm extends AuthorizingRealm {
    private Logger logger = LoggerFactory.getLogger(MyRealm.class);
    @Autowired
    private ShiroService shiroService;

    public MyRealm(CredentialsMatcher matcher) {
        super(matcher);
        //设置之后就没有缓存机制了
        setCachingEnabled(false);
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String accout = MyString.Object2String(SecurityUtils.getSubject().getPrincipal());
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //根据账号查找用户所有的角色
        List<Role> roleList = this.shiroService.select_UserRole(accout);
        Set<String> rolename = new HashSet<String>();
        Set<String> roleid = new HashSet<String>();
        for (Role r : roleList) {
            roleid.add(r.getRoleid());
            rolename.add(r.getRolename());
        }
        simpleAuthorizationInfo.setRoles(rolename);
        Set<String> permissions = this.shiroService.select_UserPermissions(roleid, accout);
        simpleAuthorizationInfo.setStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }

    /**
     * 验证当前登录的Subject
     * LoginController.login()方法中执行Subject.login()时 执行此方法
     */
    @Override
    //UserRealm继承了AuthenticatingRealm这个接口，这个接口中有getAuthenticationInfo这个方法
    //这个方法中有doGetAuthenticationInfo方法和assertCredentialsMatch方法
    //其中assertCredentialsMatch方法用于将doGetAuthenticationInfo返回的AuthenticationInfo对象进行比对，即密码的比对
    //UserRealm重写了doGetAuthenticationInfo方法
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1. 把 AuthenticationToken 转换为 UsernamePasswordToken
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        //2. 从 UsernamePasswordToken 中来获取 username
        String account = upToken.getUsername();
        //3. 调用数据库的方法, 从数据库中查询 username 对应的用户记录
        List<User> list = shiroService.select_userbyaccount(account);
        if (list == null || list.size() == 0) {
            throw new UnknownAccountException("用户不存在!");
        }
        //AuthenticatingRealm
        User user = list.get(0);
        String password_from_db = user.getPassword();
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                account,
                password_from_db,
                // salt=username+salt,盐值加密
                ByteSource.Util.bytes(account),
                getName()
        );
        return authenticationInfo;
    }

    public static void main(String[] args) {
        String hashAlgorithmName = "MD5";
        Object credentials = "www.zxmoa.com";
        Object salt = ByteSource.Util.bytes("admin");
        int hashIterations = 2;
        Object result = new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
        System.out.println(result);
    }
}
