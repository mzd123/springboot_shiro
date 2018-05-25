package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Riveruser;
import com.zxmoa.myhzt.bean.generator.RiveruserExample;
import com.zxmoa.myhzt.bean.generator.RiveruserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiveruserMapper {
    long countByExample(RiveruserExample example);

    int deleteByExample(RiveruserExample example);

    int deleteByPrimaryKey(RiveruserKey key);

    int insert(Riveruser record);

    int insertSelective(Riveruser record);

    List<Riveruser> selectByExample(RiveruserExample example);

    Riveruser selectByPrimaryKey(RiveruserKey key);

    int updateByExampleSelective(@Param("record") Riveruser record, @Param("example") RiveruserExample example);

    int updateByExample(@Param("record") Riveruser record, @Param("example") RiveruserExample example);

    int updateByPrimaryKeySelective(Riveruser record);

    int updateByPrimaryKey(Riveruser record);
}