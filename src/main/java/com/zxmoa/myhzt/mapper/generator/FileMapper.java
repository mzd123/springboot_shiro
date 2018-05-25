package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.File;
import com.zxmoa.myhzt.bean.generator.FileExample;
import com.zxmoa.myhzt.bean.generator.FileKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileMapper {
    long countByExample(FileExample example);

    int deleteByExample(FileExample example);

    int deleteByPrimaryKey(FileKey key);

    int insert(File record);

    int insertSelective(File record);

    List<File> selectByExample(FileExample example);

    File selectByPrimaryKey(FileKey key);

    int updateByExampleSelective(@Param("record") File record, @Param("example") FileExample example);

    int updateByExample(@Param("record") File record, @Param("example") FileExample example);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
}