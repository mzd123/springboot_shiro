package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Job;
import com.zxmoa.myhzt.bean.generator.JobExample;
import com.zxmoa.myhzt.bean.generator.JobKey;
import com.zxmoa.myhzt.bean.generator.JobWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    long countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int deleteByPrimaryKey(JobKey key);

    int insert(JobWithBLOBs record);

    int insertSelective(JobWithBLOBs record);

    List<JobWithBLOBs> selectByExampleWithBLOBs(JobExample example);

    List<Job> selectByExample(JobExample example);

    JobWithBLOBs selectByPrimaryKey(JobKey key);

    int updateByExampleSelective(@Param("record") JobWithBLOBs record, @Param("example") JobExample example);

    int updateByExampleWithBLOBs(@Param("record") JobWithBLOBs record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    int updateByPrimaryKeySelective(JobWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(JobWithBLOBs record);

    int updateByPrimaryKey(Job record);
}