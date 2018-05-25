package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Announcement;
import com.zxmoa.myhzt.bean.generator.AnnouncementExample;
import com.zxmoa.myhzt.bean.generator.AnnouncementKey;
import com.zxmoa.myhzt.bean.generator.AnnouncementWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnouncementMapper {
    long countByExample(AnnouncementExample example);

    int deleteByExample(AnnouncementExample example);

    int deleteByPrimaryKey(AnnouncementKey key);

    int insert(AnnouncementWithBLOBs record);

    int insertSelective(AnnouncementWithBLOBs record);

    List<AnnouncementWithBLOBs> selectByExampleWithBLOBs(AnnouncementExample example);

    List<Announcement> selectByExample(AnnouncementExample example);

    AnnouncementWithBLOBs selectByPrimaryKey(AnnouncementKey key);

    int updateByExampleSelective(@Param("record") AnnouncementWithBLOBs record, @Param("example") AnnouncementExample example);

    int updateByExampleWithBLOBs(@Param("record") AnnouncementWithBLOBs record, @Param("example") AnnouncementExample example);

    int updateByExample(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    int updateByPrimaryKeySelective(AnnouncementWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AnnouncementWithBLOBs record);

    int updateByPrimaryKey(Announcement record);
}