package com.zxmoa.myhzt.mapper.generator;

import com.zxmoa.myhzt.bean.generator.Menu;
import com.zxmoa.myhzt.bean.generator.MenuExample;
import com.zxmoa.myhzt.bean.generator.MenuKey;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(MenuKey key);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(MenuKey key);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> select_UserPermissions(@Param("roleids") Set<String> roleids);

    List<Menu> select_Userexp(@Param("account") String account);
}