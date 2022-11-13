package com.haohao.user.service;

import com.haohao.domain.user.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    /***
     * 查询所有
     * @return
     */
    List<User> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    User findById(Long id);

    /***
     * 新增
     * @param user
     */
    void add(User user);

    /***
     * 修改
     * @param User
     */
    void update(User User);

    /***
     * 删除
     * @param id
     */
    void delete(Long id);

}
