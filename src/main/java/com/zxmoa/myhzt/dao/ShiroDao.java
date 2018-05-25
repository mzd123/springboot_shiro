package com.zxmoa.myhzt.dao;

import com.zxmoa.myhzt.bean.generator.Menu;
import com.zxmoa.myhzt.bean.generator.Role;
import com.zxmoa.myhzt.bean.generator.User;
import com.zxmoa.myhzt.bean.generator.UserExample;
import com.zxmoa.myhzt.mapper.extend.User4Role;
import com.zxmoa.myhzt.mapper.generator.MenuMapper;
import com.zxmoa.myhzt.mapper.generator.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class ShiroDao {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private User4Role user4Role;
    @Autowired
    private MenuMapper menuMapper;

    public List<User> select_userbyaccount(String account) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAccountEqualTo(account);
        //未被删除的
        criteria.andStatusEqualTo("1");
        return userMapper.selectByExample(userExample);
    }

    /**
     * 根据账号查询角色
     *
     * @param account
     * @return
     */
    public List<Role> select_UserRole(String account) {
        return user4Role.select_UserRole(account);
    }

    /**
     * 根据角色集合查询权限点集合
     *
     * @param roleid
     * @return
     */
    public List<Menu> select_UserPermissions(Set<String> roleid) {
        return menuMapper.select_UserPermissions(roleid);
    }

    /**
     * 根据账号查询这个人的额外的权限点
     *
     * @param account
     * @return
     */
    public List<Menu> select_Userexp(String account) {
        return menuMapper.select_Userexp(account);
    }
}
