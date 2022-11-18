package com.haohao.user.service;

import com.haohao.domain.user.SysUser;
import com.haohao.entity.Result;

import java.util.List;

public interface UserService {

    /**
     * 登录接口
     * @return
     */
    Result login(SysUser sysUser);

    /***
     * 查询所有
     * @return
     */
    List<SysUser> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    SysUser findById(Long id);

    /***
     * 新增
     * @param sysUser
     */
    void add(SysUser sysUser);

    /***
     * 修改
     * @param SysUser
     */
    void update(SysUser SysUser);

    /**
     * 修改用户状态
     * @param sysUser
     */
    void updateState(SysUser sysUser);

    /***
     * 删除
     * @param id
     */
    void delete(Long id);

}
