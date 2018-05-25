package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Rolemenu;
import com.zxmoa.myhzt.bean.generator.RolemenuExample;
import com.zxmoa.myhzt.bean.generator.RolemenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolemenuMapper {
    long countByExample(RolemenuExample example);

    int deleteByExample(RolemenuExample example);

    int deleteByPrimaryKey(RolemenuKey key);

    int insert(Rolemenu record);

    int insertSelective(Rolemenu record);

    List<Rolemenu> selectByExample(RolemenuExample example);

    Rolemenu selectByPrimaryKey(RolemenuKey key);

    int updateByExampleSelective(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);

    int updateByExample(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);

    int updateByPrimaryKeySelective(Rolemenu record);

    int updateByPrimaryKey(Rolemenu record);
}