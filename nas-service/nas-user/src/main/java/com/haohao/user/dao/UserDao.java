package com.haohao.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haohao.user.domain.SysUser;
import org.apache.ibatis.annotations.Select;

public interface UserDao extends BaseMapper<SysUser> {

    @Select("select * from user where username = #{username}")
    public SysUser selectByUsername(String username);

}
