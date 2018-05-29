package com.zxmoa.myhzt.controller;

import com.zxmoa.myhzt.bean.common.Result;
import com.zxmoa.myhzt.bean.common.UserOnline;
import com.zxmoa.myhzt.bean.generator.Menu;
import com.zxmoa.myhzt.common.annotation.RequestTimes;
import com.zxmoa.myhzt.constant.Common;
import com.zxmoa.myhzt.filter.shiro.MyRealm;
import com.zxmoa.myhzt.service.CommonService;
import com.zxmoa.myhzt.service.ShiroService;
import com.zxmoa.myhzt.utils.MyString;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Api("Common")
public class CommonController {
    private final String baseuri = Common.baseuri;
    @Autowired
    private CommonService commonService;
    @Autowired
    private ShiroService shiroService;
    private Logger logger = LoggerFactory.getLogger(MyRealm.class);


    @RequestMapping(value = "/OverTimeRequest.do", method = RequestMethod.GET)
    public Result OverTimeRequest() {
        return new Result("503", "请求次数过于频繁，请稍后再试", null, 0, 0);
    }

    @RequiresRoles("系统管理员")
    @RequestMapping(value = baseuri + "select_log.do", method = RequestMethod.GET)
    @ApiOperation("查询日志列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "logid", value = "日志id", dataType = "String", required = false, paramType = "query"),
            @ApiImplicitParam(name = "ifsuccess", value = "是否操作成功（success表示成功，fail表示失败）", dataType = "String", required = false, paramType = "query"),
            @ApiImplicitParam(name = "starttime", value = "开始时间（YYYY-MM-dd）", dataType = "String", required = false, paramType = "query"),
            @ApiImplicitParam(name = "endtime", value = "结束时间（YYYY-MM-dd）", dataType = "String", required = false, paramType = "query"),
            @ApiImplicitParam(name = "username", value = "用户名", dataType = "String", required = false, paramType = "query"),
            @ApiImplicitParam(name = "pagesize", value = "页面显示几条数据", dataType = "String", required = true, paramType = "query"),
            @ApiImplicitParam(name = "pagenum", value = "当前第几页", dataType = "String", required = true, paramType = "query")
    })
    public Result select_log(String logid, String ifsuccess, String starttime, String endtime, String username, String pagesize, String pagenum) {
        try {
            logid = MyString.Object2String(logid);
            if ((!logid.equals("")) && logid.length() != 32) {
                return new Result("400", "logid无效", null, 0, 0);
            }
            ifsuccess = MyString.Object2String(ifsuccess);
            if ((!ifsuccess.equals("")) && (!ifsuccess.equals(Common.success) || !ifsuccess.equals(Common.fail))) {
                return new Result("400", "ifsuccess无效", null, 0, 0);
            }
            starttime = MyString.Object2String(starttime);
            if ((!starttime.equals("")) && starttime.length() != 10) {
                return new Result("400", "starttime格式无效（正确格式：YYYY-MM-dd）", null, 0, 0);
            }
            endtime = MyString.Object2String(endtime);
            if ((!endtime.equals("")) && endtime.length() != 10) {
                return new Result("400", "endtime格式无效（正确格式：YYYY-MM-dd）", null, 0, 0);
            }
            username = MyString.Object2String(username);
            pagesize = MyString.Object2String(pagesize);
            pagenum = MyString.Object2String(pagenum);
            return commonService.select_Log(logid, ifsuccess, starttime, endtime, username, pagesize, pagenum);
        } catch (Exception e) {
            logger.error(e.toString());
            return new Result("500", "服务器内部错误", null, 0, 0);
        }
    }

    //5分钟内不能连续请求登入接口5次
    @RequestTimes(time = 60 * 1000 * 5, count = 5)
    @RequestMapping(value = baseuri + "login.do", method = RequestMethod.GET)
    @ApiOperation("用户登入")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "账号", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "query", dataType = "String")
    })
    public Result login(String account, String password) {
        try {
            account = MyString.Object2String(account);
            if ("".equals(account)) {
                return new Result("400", "账号不能为空", null, 0, 0);
            }
            password = MyString.Object2String(password);
            if ("".equals(password)) {
                return new Result("400", "密码不能为空", null, 0, 0);
            }
            shiroService.login(account, password);
            //查询他所拥有的菜单
            List<Menu> list = shiroService.getMenu(account);
            return new Result("200", "登入成功", list, 0, 0);
        } catch (UnknownAccountException e) {
            return new Result("500", "用户不存在", null, 0, 0);
        } catch (IncorrectCredentialsException e) {
            return new Result("500", "密码不正确", null, 0, 0);
        } catch (AuthenticationException e) {
            return new Result("500", "登入失败", null, 0, 0);
        } catch (Exception e) {
            logger.error(e.toString());
            return new Result("500", "服务器内部错误", null, 0, 0);
        }
    }

    @RequiresRoles("系统管理员")
    @RequestMapping(value = baseuri + "select_useronline.do", method = RequestMethod.GET)
    @ApiOperation("获取在线人员列表")
    public Result select_useronline() {
        try {
            List<UserOnline> list = shiroService.select_UserOnline();
            return new Result("200", "获取在线人员成功", list, 0, 0);
        } catch (Exception e) {
            logger.error(e.toString());
            return new Result("500", "服务器内部错误", null, 0, 0);
        }
    }

    @RequiresRoles("系统管理员")
    @RequestMapping(value = baseuri + "forceLogout.do", method = RequestMethod.GET)
    @ApiOperation("将人踢下线")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sessionid", value = "缓存id", required = true, paramType = "query", dataType = "String")
    })
    public Result forceLogout(String sessionid) {
        try {
            shiroService.forceLogout(sessionid);
            return new Result("200", "踢成功", null, 0, 0);
        } catch (Exception e) {
            logger.error(e.toString());
            if ("org.apache.shiro.session.UnknownSessionException".equals(e.getClass().getName())) {
                return new Result("500", "session不存在", null, 0, 0);
            }
            return new Result("500", "服务器内部错误", null, 0, 0);
        }
    }
}
