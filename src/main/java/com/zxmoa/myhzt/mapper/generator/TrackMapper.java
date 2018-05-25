package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Track;
import com.zxmoa.myhzt.bean.generator.TrackExample;
import com.zxmoa.myhzt.bean.generator.TrackKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrackMapper {
    long countByExample(TrackExample example);

    int deleteByExample(TrackExample example);

    int deleteByPrimaryKey(TrackKey key);

    int insert(Track record);

    int insertSelective(Track record);

    List<Track> selectByExample(TrackExample example);

    Track selectByPrimaryKey(TrackKey key);

    int updateByExampleSelective(@Param("record") Track record, @Param("example") TrackExample example);

    int updateByExample(@Param("record") Track record, @Param("example") TrackExample example);

    int updateByPrimaryKeySelective(Track record);

    int updateByPrimaryKey(Track record);
}