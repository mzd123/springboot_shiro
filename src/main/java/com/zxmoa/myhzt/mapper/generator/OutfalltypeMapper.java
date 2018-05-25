package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Outfalltype;
import com.zxmoa.myhzt.bean.generator.OutfalltypeExample;
import com.zxmoa.myhzt.bean.generator.OutfalltypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutfalltypeMapper {
    long countByExample(OutfalltypeExample example);

    int deleteByExample(OutfalltypeExample example);

    int deleteByPrimaryKey(OutfalltypeKey key);

    int insert(Outfalltype record);

    int insertSelective(Outfalltype record);

    List<Outfalltype> selectByExample(OutfalltypeExample example);

    Outfalltype selectByPrimaryKey(OutfalltypeKey key);

    int updateByExampleSelective(@Param("record") Outfalltype record, @Param("example") OutfalltypeExample example);

    int updateByExample(@Param("record") Outfalltype record, @Param("example") OutfalltypeExample example);

    int updateByPrimaryKeySelective(Outfalltype record);

    int updateByPrimaryKey(Outfalltype record);
}