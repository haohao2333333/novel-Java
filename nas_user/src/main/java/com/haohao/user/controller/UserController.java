package com.haohao.user.controller;

import com.haohao.user.service.UserService;
import com.haohao.domain.user.User;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    public Result login(){

        return new Result(true, StatusCode.OK, "查询成功");
    }

    /**
     * 查询全部数据
     * @return
     */
    @GetMapping
    public Result findAll() {
        List<User> userList = userService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", userList);
    }

    /***
     * 根据ID查询数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result findById(@PathVariable Long id){
        User user = userService.findById(id);
        return new Result(true,StatusCode.OK,"查询成功",user);
    }

    /***
     * 新增数据
     * @param user
     * @return
     */
    @PostMapping
    public Result add(@RequestBody User user){
        userService.add(user);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 修改数据
     * @param user
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    public Result update(@RequestBody User user,@PathVariable Long id){
        user.setId(id);
        userService.update(user);
        return new Result(true,StatusCode.OK,"修改成功");
    }

}
