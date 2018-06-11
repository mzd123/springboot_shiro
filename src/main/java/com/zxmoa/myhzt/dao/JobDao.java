package com.zxmoa.myhzt.dao;

import com.zxmoa.myhzt.bean.generator.Job;
import com.zxmoa.myhzt.bean.generator.JobExample;
import com.zxmoa.myhzt.bean.generator.JobWithBLOBs;
import com.zxmoa.myhzt.mapper.generator.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JobDao {
    @Autowired
    private JobMapper jobMapper;

    /**
     * 获取定时任务集合
     *
     * @return
     */
    public List<Job> jobList() {
        JobExample jobExample = new JobExample();
        JobExample.Criteria criteria = jobExample.createCriteria();
        criteria.andStatusEqualTo("1");
        return jobMapper.selectByExample(jobExample);
    }

    /**
     * 保存定时任务
     *
     * @param jobWithBLOBs
     */
    public void save(JobWithBLOBs jobWithBLOBs) {
        jobMapper.insert(jobWithBLOBs);
    }
}
