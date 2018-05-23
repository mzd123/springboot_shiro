package com.zxmoa.myhzt.mapper.extend;

import com.zxmoa.myhzt.bean.extend.log.LogExtend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//扩展
public interface LogExtendMapper {

    List<LogExtend> select_LogExtend(@Param("logid") String logid, @Param("ifsuccess") String ifsuccess, @Param("starttime") String starttime, @Param("endtime") String endtime, @Param("username") String username);
}