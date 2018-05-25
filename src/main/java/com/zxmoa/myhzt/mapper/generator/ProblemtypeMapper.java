package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Problemtype;
import com.zxmoa.myhzt.bean.generator.ProblemtypeExample;
import com.zxmoa.myhzt.bean.generator.ProblemtypeKey;
import com.zxmoa.myhzt.bean.generator.ProblemtypeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProblemtypeMapper {
    long countByExample(ProblemtypeExample example);

    int deleteByExample(ProblemtypeExample example);

    int deleteByPrimaryKey(ProblemtypeKey key);

    int insert(ProblemtypeWithBLOBs record);

    int insertSelective(ProblemtypeWithBLOBs record);

    List<ProblemtypeWithBLOBs> selectByExampleWithBLOBs(ProblemtypeExample example);

    List<Problemtype> selectByExample(ProblemtypeExample example);

    ProblemtypeWithBLOBs selectByPrimaryKey(ProblemtypeKey key);

    int updateByExampleSelective(@Param("record") ProblemtypeWithBLOBs record, @Param("example") ProblemtypeExample example);

    int updateByExampleWithBLOBs(@Param("record") ProblemtypeWithBLOBs record, @Param("example") ProblemtypeExample example);

    int updateByExample(@Param("record") Problemtype record, @Param("example") ProblemtypeExample example);

    int updateByPrimaryKeySelective(ProblemtypeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProblemtypeWithBLOBs record);

    int updateByPrimaryKey(Problemtype record);
}