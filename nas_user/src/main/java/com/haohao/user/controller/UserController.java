package com.haohao.user.controller;

import com.haohao.user.service.UserService;
import com.haohao.domain.user.SysUser;
import com.haohao.entity.Result;
import com.haohao.entity.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录接口
     */
    @PostMapping("/login")
    public Result login(@RequestBody SysUser sysUser){
        Result login = userService.login(sysUser);
        return new Result(true, StatusCode.OK, "登录成功",login);
    }

    /**
     * 查询全部数据
     * @return
     */
    @GetMapping
    public Result findAll() {
        List<SysUser> sysUserList = userService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", sysUserList);
    }

    /***
     * 根据ID查询数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result findById(@PathVariable Long id){
        SysUser sysUser = userService.findById(id);
        return new Result(true,StatusCode.OK,"查询成功", sysUser);
    }

    /***
     * 新增数据
     * @param sysUser
     * @return
     */
    @PostMapping
    public Result add(@RequestBody SysUser sysUser){
        userService.add(sysUser);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 修改数据
     * @param sysUser
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    public Result update(@RequestBody SysUser sysUser, @PathVariable Long id){
        sysUser.setUser_id(id);
        userService.update(sysUser);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /**
     * 修改用户状态
     * @param sysUser
     * @param id
     * @param state
     * @return
     */
    @PutMapping(value="/{id}/{state}")
    public Result updateState(@RequestBody SysUser sysUser, @PathVariable Long id, @PathVariable Integer state){
        sysUser.setUser_id(id);
        sysUser.setState(state);
        userService.updateState(sysUser);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 根据ID删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){
        userService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

}
