package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Complaints;
import com.zxmoa.myhzt.bean.generator.ComplaintsExample;
import com.zxmoa.myhzt.bean.generator.ComplaintsKey;
import com.zxmoa.myhzt.bean.generator.ComplaintsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplaintsMapper {
    long countByExample(ComplaintsExample example);

    int deleteByExample(ComplaintsExample example);

    int deleteByPrimaryKey(ComplaintsKey key);

    int insert(ComplaintsWithBLOBs record);

    int insertSelective(ComplaintsWithBLOBs record);

    List<ComplaintsWithBLOBs> selectByExampleWithBLOBs(ComplaintsExample example);

    List<Complaints> selectByExample(ComplaintsExample example);

    ComplaintsWithBLOBs selectByPrimaryKey(ComplaintsKey key);

    int updateByExampleSelective(@Param("record") ComplaintsWithBLOBs record, @Param("example") ComplaintsExample example);

    int updateByExampleWithBLOBs(@Param("record") ComplaintsWithBLOBs record, @Param("example") ComplaintsExample example);

    int updateByExample(@Param("record") Complaints record, @Param("example") ComplaintsExample example);

    int updateByPrimaryKeySelective(ComplaintsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ComplaintsWithBLOBs record);

    int updateByPrimaryKey(Complaints record);
}