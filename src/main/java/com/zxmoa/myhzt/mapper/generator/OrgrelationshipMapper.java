package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Orgrelationship;
import com.zxmoa.myhzt.bean.generator.OrgrelationshipExample;
import com.zxmoa.myhzt.bean.generator.OrgrelationshipKey;
import com.zxmoa.myhzt.bean.generator.OrgrelationshipWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgrelationshipMapper {
    long countByExample(OrgrelationshipExample example);

    int deleteByExample(OrgrelationshipExample example);

    int deleteByPrimaryKey(OrgrelationshipKey key);

    int insert(OrgrelationshipWithBLOBs record);

    int insertSelective(OrgrelationshipWithBLOBs record);

    List<OrgrelationshipWithBLOBs> selectByExampleWithBLOBs(OrgrelationshipExample example);

    List<Orgrelationship> selectByExample(OrgrelationshipExample example);

    OrgrelationshipWithBLOBs selectByPrimaryKey(OrgrelationshipKey key);

    int updateByExampleSelective(@Param("record") OrgrelationshipWithBLOBs record, @Param("example") OrgrelationshipExample example);

    int updateByExampleWithBLOBs(@Param("record") OrgrelationshipWithBLOBs record, @Param("example") OrgrelationshipExample example);

    int updateByExample(@Param("record") Orgrelationship record, @Param("example") OrgrelationshipExample example);

    int updateByPrimaryKeySelective(OrgrelationshipWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrgrelationshipWithBLOBs record);

    int updateByPrimaryKey(Orgrelationship record);
}