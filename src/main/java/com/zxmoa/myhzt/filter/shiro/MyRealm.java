package com.zxmoa.myhzt.filter.shiro;

import com.alibaba.fastjson.JSONObject;
import com.zxmoa.myhzt.bean.generator.User;
import com.zxmoa.myhzt.service.CommonService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;


public class MyRealm extends AuthorizingRealm {
    private Logger logger = LoggerFactory.getLogger(MyRealm.class);
    @Autowired
    private CommonService commonService;

    public MyRealm(CredentialsMatcher matcher) {
        super(matcher);
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Session session = SecurityUtils.getSubject().getSession();
        //查询用户的权限
        JSONObject permission = null;//(JSONObject) session.getAttribute(Constants.SESSION_USER_PERMISSION);
        logger.info("permission的值为:" + permission);
        logger.info("本用户权限为:" + permission.get("permissionList"));
        //为当前用户设置角色和权限
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addStringPermissions((Collection<String>) permission.get("permissionList"));
        return authorizationInfo;
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
        List<User> list = commonService.select_userbyaccount(account);
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
