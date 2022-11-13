package com.haohao.user.service.ipml;

import com.haohao.user.dao.UserDao;
import com.haohao.user.service.UserService;
import com.haohao.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceIpml implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.selectList(null);
    }

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    @Override
    public User findById(Long id){
        return  userDao.selectById(id);
    }


    /**
     * 增加
     * @param user
     */
    @Override
    public void add(User user){
        userDao.insert(user);
    }


    /**
     * 修改
     * @param user
     */
    @Override
    public void update(User user){
        userDao.updateById(user);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(Long id){
        userDao.deleteById(id);
    }

}
