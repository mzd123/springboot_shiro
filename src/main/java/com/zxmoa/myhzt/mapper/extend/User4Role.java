package com.zxmoa.myhzt.mapper.extend;

import com.zxmoa.myhzt.bean.generator.Role;

import java.util.List;

public interface User4Role {
    List<Role> select_UserRole(String account);
}
