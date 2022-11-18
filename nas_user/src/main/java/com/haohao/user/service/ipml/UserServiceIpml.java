package com.haohao.user.service.ipml;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.haohao.entity.Result;
import com.haohao.entity.StatusCode;
import com.haohao.user.dao.UserDao;
import com.haohao.user.service.UserService;
import com.haohao.domain.user.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIpml implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 用户登录
     * @param sysUser
     * @return
     */
    public Result login(SysUser sysUser){
        String password = sysUser.getPassword();
        // 密码进行_md5加密
//        password = DigestUtils.md5DigestAsHex(password.getBytes());
        // 查询判断
        LambdaQueryWrapper<SysUser> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.eq(SysUser::getUsername, sysUser.getUsername());
        // 查询用户信息
        SysUser sysUser1 = userDao.selectOne(userLambdaQueryWrapper);
        // 判断用户是否为空
        if (sysUser1 == null) {
            return new Result(false, StatusCode.LOGINERROR, "账号或密码错误");
        }
        // 判断密码是否正确
        if (!sysUser1.getPassword().equals(password)){
            return new Result(false, StatusCode.LOGINERROR, "账号或密码错误");
        }
        // 判断用户状态是否开启
        if (sysUser1.getState() == 0) {
            return new Result(false, StatusCode.ACCESSERROR, "账号被禁止");
        }
        // 返回用户数据
        return new Result(true, StatusCode.OK, "登录成功", sysUser1);
    }

    /**
     * 查找所有用户
     * @return
     */
    public List<SysUser> findAll() {
        return userDao.selectList(null);
    }

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    @Override
    public SysUser findById(Long id){
        return  userDao.selectById(id);
    }


    /**
     * 增加
     * @param sysUser
     */
    @Override
    public void add(SysUser sysUser){
        userDao.insert(sysUser);
    }


    /**
     * 修改
     * @param sysUser
     */
    @Override
    public void update(SysUser sysUser){
        userDao.updateById(sysUser);
    }

    /**
     * 修改用户状态
     * @param sysUser
     */
    public void updateState(SysUser sysUser){
        if (sysUser.getState() == 1){
            sysUser.setState(1);
        } else {
            sysUser.setState(0);
        }
        userDao.updateById(sysUser);
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
