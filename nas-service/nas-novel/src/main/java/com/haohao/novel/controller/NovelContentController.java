package com.haohao.novel.controller;

import com.haohao.novel.domain.NovelContent;
import com.haohao.entity.Result;
import com.haohao.entity.StatusCode;
import com.haohao.novel.service.NovelContentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Slf4j
@Api(value = "小说章节内容模块",tags = "小说章节内容控制层")
@RequestMapping("/novelContent")
public class NovelContentController {

    @Autowired
    private NovelContentService novelContentService;

    @ApiOperation(value = "小说章节内容",notes = "查询小说章节内容接口")
    @ApiImplicitParam(name = "id",value = "小说章节id",required = true,paramType = "path")
    @GetMapping("/{id}")
    public Result findByNovelChapter(@PathVariable Long id) {
        NovelContent novelContent = novelContentService.findByNovelChapter(id);
        return new Result(true, StatusCode.OK,"查询成功", novelContent);
    }

    @ApiOperation(value = "添加小说内容",notes = "添加小说章节内容接口")
    @ApiImplicitParam(name = "novelContent",value = "小说章节内容对象",required = true,paramType = "path")
    @PostMapping
    public Result add (@RequestBody NovelContent novelContent) {
        novelContentService.add(novelContent);
        return new Result(true, StatusCode.OK,"添加成功");
    }

}
