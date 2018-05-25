package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Handle;
import com.zxmoa.myhzt.bean.generator.HandleExample;
import com.zxmoa.myhzt.bean.generator.HandleKey;
import com.zxmoa.myhzt.bean.generator.HandleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HandleMapper {
    long countByExample(HandleExample example);

    int deleteByExample(HandleExample example);

    int deleteByPrimaryKey(HandleKey key);

    int insert(HandleWithBLOBs record);

    int insertSelective(HandleWithBLOBs record);

    List<HandleWithBLOBs> selectByExampleWithBLOBs(HandleExample example);

    List<Handle> selectByExample(HandleExample example);

    HandleWithBLOBs selectByPrimaryKey(HandleKey key);

    int updateByExampleSelective(@Param("record") HandleWithBLOBs record, @Param("example") HandleExample example);

    int updateByExampleWithBLOBs(@Param("record") HandleWithBLOBs record, @Param("example") HandleExample example);

    int updateByExample(@Param("record") Handle record, @Param("example") HandleExample example);

    int updateByPrimaryKeySelective(HandleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HandleWithBLOBs record);

    int updateByPrimaryKey(Handle record);
}