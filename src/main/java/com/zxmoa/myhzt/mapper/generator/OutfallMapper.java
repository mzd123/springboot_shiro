package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Outfall;
import com.zxmoa.myhzt.bean.generator.OutfallExample;
import com.zxmoa.myhzt.bean.generator.OutfallKey;
import com.zxmoa.myhzt.bean.generator.OutfallWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutfallMapper {
    long countByExample(OutfallExample example);

    int deleteByExample(OutfallExample example);

    int deleteByPrimaryKey(OutfallKey key);

    int insert(OutfallWithBLOBs record);

    int insertSelective(OutfallWithBLOBs record);

    List<OutfallWithBLOBs> selectByExampleWithBLOBs(OutfallExample example);

    List<Outfall> selectByExample(OutfallExample example);

    OutfallWithBLOBs selectByPrimaryKey(OutfallKey key);

    int updateByExampleSelective(@Param("record") OutfallWithBLOBs record, @Param("example") OutfallExample example);

    int updateByExampleWithBLOBs(@Param("record") OutfallWithBLOBs record, @Param("example") OutfallExample example);

    int updateByExample(@Param("record") Outfall record, @Param("example") OutfallExample example);

    int updateByPrimaryKeySelective(OutfallWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OutfallWithBLOBs record);

    int updateByPrimaryKey(Outfall record);
}