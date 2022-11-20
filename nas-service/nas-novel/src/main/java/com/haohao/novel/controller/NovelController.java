package com.haohao.novel.controller;

import com.github.pagehelper.PageInfo;
import com.haohao.novel.service.NovelService;
import com.haohao.novel.domain.Novel;
import com.haohao.entity.Result;
import com.haohao.entity.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
@EnableSwagger2
@Api(value = "小说模块",tags = "小说控制层")
@RequestMapping("/novel")
public class NovelController {

    @Autowired
    private NovelService novelService;

    @ApiOperation(value = "查询所有的小说",notes = "查询所有小说接口")
    @GetMapping
    public Result findAll() {
        List<Novel> NovelList = novelService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", NovelList);
    }

    @ApiOperation(value = "分页查询",notes = "分页查询接口")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "pageNum",value = "页码",required = true,paramType = "path"),
            @ApiImplicitParam(name = "pageSize",value = "页条数",required = true,paramType = "path")
    })
    @GetMapping(value = "/page/{pageNum}/{pageSize}")
    public Result Page(@PathVariable int pageNum,@PathVariable int pageSize ){
        PageInfo<Novel> novelsByPage = novelService.getNovelsByPage(pageNum, pageSize);
        return new Result(true,StatusCode.OK,"查询成功",novelsByPage);
    }

    @ApiOperation(value = "根据id查询小说对象",notes = "id查询小说接口")
    @ApiImplicitParam(name = "id",value = "小说id",required = true,paramType = "path")
    @GetMapping("/{id}")
    public Result findById(@PathVariable Long id){
        Novel novel = novelService.findById(id);
        return new Result(true,StatusCode.OK,"查询成功",novel);
    }

    @ApiOperation(value = "添加小说对象",notes = "添加小说接口")
    @ApiImplicitParam(name = "user",value = "小说对象",dataType = "User")
    @PostMapping
    public Result add(@RequestBody Novel novel){
        novelService.add(novel);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    @ApiOperation(value = "修改小说内容",notes = "修改小说接口")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "Novel",value = "小说对象",required = true,paramType = "path"),
            @ApiImplicitParam(name = "id",value = "小说id",required = true,paramType = "path")
    })
    @PutMapping("/{id}")
    public Result update(@RequestBody Novel novel,@PathVariable Long id){
        novel.setId(id);
        novelService.update(novel);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    @ApiOperation(value = "删除小说对象",notes = "删除小说接口")
    @ApiImplicitParam(name = "id",value = "小说id",required = true,paramType = "path")
    @DeleteMapping("/{id}" )
    public Result delete(@PathVariable Long id){
        novelService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

}
