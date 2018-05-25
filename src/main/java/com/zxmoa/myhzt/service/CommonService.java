package com.zxmoa.myhzt.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxmoa.myhzt.bean.common.Result;
import com.zxmoa.myhzt.bean.extend.log.LogExtend;
import com.zxmoa.myhzt.bean.generator.LogWithBLOBs;
import com.zxmoa.myhzt.common.annotation.Log;
import com.zxmoa.myhzt.constant.Common;
import com.zxmoa.myhzt.dao.CommonDao;
import com.zxmoa.myhzt.utils.MyString;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonService {
    @Autowired
    private CommonDao commonDao;

    @RequiresRoles("管理员")
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


}
