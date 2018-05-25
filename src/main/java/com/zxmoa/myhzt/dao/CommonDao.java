package com.zxmoa.myhzt.dao;

import com.zxmoa.myhzt.bean.extend.log.LogExtend;
import com.zxmoa.myhzt.bean.generator.LogWithBLOBs;
import com.zxmoa.myhzt.mapper.extend.LogExtendMapper;
import com.zxmoa.myhzt.mapper.generator.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommonDao {
    @Autowired
    private LogExtendMapper logExtendMapper;


    @Autowired
    private LogMapper logMapper;

    public List<LogExtend> select_LogD(String logid, String ifsuccess, String starttime, String endtime, String username) {
        return logExtendMapper.select_LogExtend(logid, ifsuccess, starttime, endtime, username);
    }

    public void insert_logD(LogWithBLOBs log) {
        logMapper.insert(log);
    }


}
