package com.haohao.novel.service;

import com.haohao.novel.domain.NovelChapter;

import java.util.List;

public interface NovelChapterService {

    /**
     * 根据id查询章节列表
     * @return
     */
    List<NovelChapter> NovelChapterList(Long id);

    /***
     * 新增
     * @param novelChapter
     */
    void add(NovelChapter novelChapter);

}
