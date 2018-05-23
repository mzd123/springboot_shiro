package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Log;
import com.zxmoa.myhzt.bean.generator.LogExample;
import com.zxmoa.myhzt.bean.generator.LogKey;
import com.zxmoa.myhzt.bean.generator.LogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogMapper {
    long countByExample(LogExample example);

    int deleteByExample(LogExample example);

    int deleteByPrimaryKey(LogKey key);

    int insert(LogWithBLOBs record);

    int insertSelective(LogWithBLOBs record);

    List<LogWithBLOBs> selectByExampleWithBLOBs(LogExample example);

    List<Log> selectByExample(LogExample example);

    LogWithBLOBs selectByPrimaryKey(LogKey key);

    int updateByExampleSelective(@Param("record") LogWithBLOBs record, @Param("example") LogExample example);

    int updateByExampleWithBLOBs(@Param("record") LogWithBLOBs record, @Param("example") LogExample example);

    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);

    int updateByPrimaryKeySelective(LogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LogWithBLOBs record);

    int updateByPrimaryKey(Log record);
}