package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.River;
import com.zxmoa.myhzt.bean.generator.RiverExample;
import com.zxmoa.myhzt.bean.generator.RiverKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiverMapper {
    long countByExample(RiverExample example);

    int deleteByExample(RiverExample example);

    int deleteByPrimaryKey(RiverKey key);

    int insert(River record);

    int insertSelective(River record);

    List<River> selectByExample(RiverExample example);

    River selectByPrimaryKey(RiverKey key);

    int updateByExampleSelective(@Param("record") River record, @Param("example") RiverExample example);

    int updateByExample(@Param("record") River record, @Param("example") RiverExample example);

    int updateByPrimaryKeySelective(River record);

    int updateByPrimaryKey(River record);
}