package com.haohao.novel.controller;

import com.haohao.novel.domain.NovelChapter;
import com.haohao.entity.Result;
import com.haohao.entity.StatusCode;
import com.haohao.novel.service.NovelChapterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
@Api(value = "小说章节模块",tags = "小说章节控制层")
@RequestMapping("/novelChapter")
public class NovelChapterController {

    @Autowired
    private NovelChapterService novelChapterService;

    @ApiOperation(value = "根据id查询小说章节列表",notes = "查询小说章节列表")
    @ApiImplicitParam(name = "id",value = "小说id",required = true,paramType = "path")
    @GetMapping("/{id}")
    public Result NovelChapterList(@PathVariable Long id) {
        List<NovelChapter> novelChappterList = novelChapterService.NovelChapterList(id);
        return new Result(true, StatusCode.OK,"查询成功", novelChappterList);
    }

    /**
     * 根据小说id添加雄小说章节
     */
    @ApiOperation(value = "添加小说章节",notes = "添加小说章节接口")
    @ApiImplicitParam(name = "novelChapter",value = "小说章节对象",required = true,paramType = "path")
    @PostMapping
    public Result NovelChapterAdd(@RequestBody NovelChapter novelChapter) {
        novelChapterService.add(novelChapter);
        return new Result(true,StatusCode.OK,"添加成功");
    }

}
