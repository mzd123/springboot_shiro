package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Walk;
import com.zxmoa.myhzt.bean.generator.WalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WalkMapper {
    long countByExample(WalkExample example);

    int deleteByExample(WalkExample example);

    int insert(Walk record);

    int insertSelective(Walk record);

    List<Walk> selectByExample(WalkExample example);

    int updateByExampleSelective(@Param("record") Walk record, @Param("example") WalkExample example);

    int updateByExample(@Param("record") Walk record, @Param("example") WalkExample example);
}