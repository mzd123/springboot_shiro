package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Public;
import com.zxmoa.myhzt.bean.generator.PublicExample;
import com.zxmoa.myhzt.bean.generator.PublicKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicMapper {
    long countByExample(PublicExample example);

    int deleteByExample(PublicExample example);

    int deleteByPrimaryKey(PublicKey key);

    int insert(Public record);

    int insertSelective(Public record);

    List<Public> selectByExample(PublicExample example);

    Public selectByPrimaryKey(PublicKey key);

    int updateByExampleSelective(@Param("record") Public record, @Param("example") PublicExample example);

    int updateByExample(@Param("record") Public record, @Param("example") PublicExample example);

    int updateByPrimaryKeySelective(Public record);

    int updateByPrimaryKey(Public record);
}