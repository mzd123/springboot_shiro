package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Riverrelationship;
import com.zxmoa.myhzt.bean.generator.RiverrelationshipExample;
import com.zxmoa.myhzt.bean.generator.RiverrelationshipKey;
import com.zxmoa.myhzt.bean.generator.RiverrelationshipWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiverrelationshipMapper {
    long countByExample(RiverrelationshipExample example);

    int deleteByExample(RiverrelationshipExample example);

    int deleteByPrimaryKey(RiverrelationshipKey key);

    int insert(RiverrelationshipWithBLOBs record);

    int insertSelective(RiverrelationshipWithBLOBs record);

    List<RiverrelationshipWithBLOBs> selectByExampleWithBLOBs(RiverrelationshipExample example);

    List<Riverrelationship> selectByExample(RiverrelationshipExample example);

    RiverrelationshipWithBLOBs selectByPrimaryKey(RiverrelationshipKey key);

    int updateByExampleSelective(@Param("record") RiverrelationshipWithBLOBs record, @Param("example") RiverrelationshipExample example);

    int updateByExampleWithBLOBs(@Param("record") RiverrelationshipWithBLOBs record, @Param("example") RiverrelationshipExample example);

    int updateByExample(@Param("record") Riverrelationship record, @Param("example") RiverrelationshipExample example);

    int updateByPrimaryKeySelective(RiverrelationshipWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RiverrelationshipWithBLOBs record);

    int updateByPrimaryKey(Riverrelationship record);
}