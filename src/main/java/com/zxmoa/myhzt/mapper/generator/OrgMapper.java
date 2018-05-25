package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Org;
import com.zxmoa.myhzt.bean.generator.OrgExample;
import com.zxmoa.myhzt.bean.generator.OrgKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgMapper {
    long countByExample(OrgExample example);

    int deleteByExample(OrgExample example);

    int deleteByPrimaryKey(OrgKey key);

    int insert(Org record);

    int insertSelective(Org record);

    List<Org> selectByExample(OrgExample example);

    Org selectByPrimaryKey(OrgKey key);

    int updateByExampleSelective(@Param("record") Org record, @Param("example") OrgExample example);

    int updateByExample(@Param("record") Org record, @Param("example") OrgExample example);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKey(Org record);
}