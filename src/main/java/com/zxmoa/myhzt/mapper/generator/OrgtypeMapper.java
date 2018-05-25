package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Orgtype;
import com.zxmoa.myhzt.bean.generator.OrgtypeExample;
import com.zxmoa.myhzt.bean.generator.OrgtypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgtypeMapper {
    long countByExample(OrgtypeExample example);

    int deleteByExample(OrgtypeExample example);

    int deleteByPrimaryKey(OrgtypeKey key);

    int insert(Orgtype record);

    int insertSelective(Orgtype record);

    List<Orgtype> selectByExample(OrgtypeExample example);

    Orgtype selectByPrimaryKey(OrgtypeKey key);

    int updateByExampleSelective(@Param("record") Orgtype record, @Param("example") OrgtypeExample example);

    int updateByExample(@Param("record") Orgtype record, @Param("example") OrgtypeExample example);

    int updateByPrimaryKeySelective(Orgtype record);

    int updateByPrimaryKey(Orgtype record);
}