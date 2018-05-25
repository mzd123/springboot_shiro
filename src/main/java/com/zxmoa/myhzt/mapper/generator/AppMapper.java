package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.App;
import com.zxmoa.myhzt.bean.generator.AppExample;
import com.zxmoa.myhzt.bean.generator.AppKey;
import com.zxmoa.myhzt.bean.generator.AppWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppMapper {
    long countByExample(AppExample example);

    int deleteByExample(AppExample example);

    int deleteByPrimaryKey(AppKey key);

    int insert(AppWithBLOBs record);

    int insertSelective(AppWithBLOBs record);

    List<AppWithBLOBs> selectByExampleWithBLOBs(AppExample example);

    List<App> selectByExample(AppExample example);

    AppWithBLOBs selectByPrimaryKey(AppKey key);

    int updateByExampleSelective(@Param("record") AppWithBLOBs record, @Param("example") AppExample example);

    int updateByExampleWithBLOBs(@Param("record") AppWithBLOBs record, @Param("example") AppExample example);

    int updateByExample(@Param("record") App record, @Param("example") AppExample example);

    int updateByPrimaryKeySelective(AppWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AppWithBLOBs record);

    int updateByPrimaryKey(App record);
}