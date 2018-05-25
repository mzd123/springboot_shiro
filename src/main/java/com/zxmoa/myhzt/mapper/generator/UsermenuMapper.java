package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Usermenu;
import com.zxmoa.myhzt.bean.generator.UsermenuExample;
import com.zxmoa.myhzt.bean.generator.UsermenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsermenuMapper {
    long countByExample(UsermenuExample example);

    int deleteByExample(UsermenuExample example);

    int deleteByPrimaryKey(UsermenuKey key);

    int insert(Usermenu record);

    int insertSelective(Usermenu record);

    List<Usermenu> selectByExample(UsermenuExample example);

    Usermenu selectByPrimaryKey(UsermenuKey key);

    int updateByExampleSelective(@Param("record") Usermenu record, @Param("example") UsermenuExample example);

    int updateByExample(@Param("record") Usermenu record, @Param("example") UsermenuExample example);

    int updateByPrimaryKeySelective(Usermenu record);

    int updateByPrimaryKey(Usermenu record);
}