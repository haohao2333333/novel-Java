package com.haohao.novel.service;

import com.haohao.novel.domain.NovelContent;

public interface NovelContentService {

    /**
     * 根据Novel Chapter.Id查询章节内容
     * @param id
     * @return
     */
    NovelContent findByNovelChapter(Long id);

    /***
     * 新增
     * @param NovelContent
     */
    void add(NovelContent NovelContent);

}
