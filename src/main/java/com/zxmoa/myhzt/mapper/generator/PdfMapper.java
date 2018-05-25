package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Pdf;
import com.zxmoa.myhzt.bean.generator.PdfExample;
import com.zxmoa.myhzt.bean.generator.PdfKey;
import com.zxmoa.myhzt.bean.generator.PdfWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdfMapper {
    long countByExample(PdfExample example);

    int deleteByExample(PdfExample example);

    int deleteByPrimaryKey(PdfKey key);

    int insert(PdfWithBLOBs record);

    int insertSelective(PdfWithBLOBs record);

    List<PdfWithBLOBs> selectByExampleWithBLOBs(PdfExample example);

    List<Pdf> selectByExample(PdfExample example);

    PdfWithBLOBs selectByPrimaryKey(PdfKey key);

    int updateByExampleSelective(@Param("record") PdfWithBLOBs record, @Param("example") PdfExample example);

    int updateByExampleWithBLOBs(@Param("record") PdfWithBLOBs record, @Param("example") PdfExample example);

    int updateByExample(@Param("record") Pdf record, @Param("example") PdfExample example);

    int updateByPrimaryKeySelective(PdfWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PdfWithBLOBs record);

    int updateByPrimaryKey(Pdf record);
}