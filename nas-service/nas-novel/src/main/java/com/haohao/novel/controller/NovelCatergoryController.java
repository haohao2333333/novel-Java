package com.haohao.novel.controller;

import com.haohao.novel.domain.NovelCategory;
import com.haohao.entity.Result;
import com.haohao.entity.StatusCode;
import com.haohao.novel.service.NovelCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
@Api(value = "小说类目模块",tags = "小说类目控制层")
@RequestMapping("/novelCategory")
public class NovelCatergoryController {

    @Autowired
    private NovelCategoryService novelCategoryService;

    /**
     * 查询小说类目列表
     */
    @GetMapping // ("/NovelCategoryList")
    @ApiOperation(value = "小说类目列表",notes = "查询小说类目接口")
    public Result NovelCategoryList() {
        List<NovelCategory> NovelCategoryList = novelCategoryService.NovelCategoryList();
        return new Result(true, StatusCode.OK,"查询类目成功", NovelCategoryList);
    }

}
