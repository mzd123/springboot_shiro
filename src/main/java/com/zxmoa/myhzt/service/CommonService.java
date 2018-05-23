package com.zxmoa.myhzt.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxmoa.myhzt.bean.common.Result;
import com.zxmoa.myhzt.bean.extend.log.LogExtend;
import com.zxmoa.myhzt.bean.generator.LogWithBLOBs;
import com.zxmoa.myhzt.bean.generator.User;
import com.zxmoa.myhzt.common.annotation.Log;
import com.zxmoa.myhzt.constant.Common;
import com.zxmoa.myhzt.dao.CommonDao;
import com.zxmoa.myhzt.utils.MyString;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonService {
    @Autowired
    private CommonDao commonDao;

    @Log(value = "查询日志列表")
    public Result select_Log(String logid, String ifsuccess, String starttime, String endtime, String username, String pagesize, String pagenum) {
        int i = MyString.String2int(pagesize, Common.i);
        int j = MyString.String2int(pagenum, Common.j);
        PageHelper.startPage(j, i);
        List<LogExtend> list = commonDao.select_LogD(logid, ifsuccess, starttime, endtime, username);
        //获取总页数--总共应该被分为多少页
        PageInfo pageInfo = new PageInfo<>(list);
        int all = pageInfo.getPages();
        return new Result("200", "查询成功", list, list.size(), all);
    }

    /**
     * 新增日志
     *
     * @param log
     */
    public void save_log(LogWithBLOBs log) {
        commonDao.insert_logD(log);
    }

    @Log(value = "用户登入")
    public String login(String account, String password) {
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(account, password);
            Subject currentUser = SecurityUtils.getSubject();
            currentUser.login(token);
            System.out.println("登入成功");
        } catch (IncorrectCredentialsException e) {
            System.out.println("密码错误");
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("登入失败");
        }
        return "aaa";
    }

    /**
     * 根据用户账号查询用户所有信息
     *
     * @param account
     * @return
     */
    @Log(value = "根据用户名查询用户所有信息")
    public List<User> select_userbyaccount(String account) {
        return commonDao.select_userbyaccount(account);
    }
}
