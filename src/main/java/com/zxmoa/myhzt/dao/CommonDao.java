package com.zxmoa.myhzt.dao;

import com.zxmoa.myhzt.bean.extend.log.LogExtend;
import com.zxmoa.myhzt.bean.generator.LogWithBLOBs;
import com.zxmoa.myhzt.bean.generator.User;
import com.zxmoa.myhzt.bean.generator.UserExample;
import com.zxmoa.myhzt.mapper.extend.LogExtendMapper;
import com.zxmoa.myhzt.mapper.generator.LogMapper;
import com.zxmoa.myhzt.mapper.generator.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommonDao {
    @Autowired
    private LogExtendMapper logExtendMapper;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private LogMapper logMapper;

    public List<LogExtend> select_LogD(String logid, String ifsuccess, String starttime, String endtime, String username) {
        return logExtendMapper.select_LogExtend(logid, ifsuccess, starttime, endtime, username);
    }

    public void insert_logD(LogWithBLOBs log) {
        logMapper.insert(log);
    }

    public List<User> select_userbyaccount(String account) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAccountEqualTo(account);
        //未被删除的
        criteria.andStatusEqualTo("1");
        return userMapper.selectByExample(userExample);
    }
}
