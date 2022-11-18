package com.haohao.novel.service;

import com.haohao.domain.novel.Novel;
import com.haohao.domain.novel.NovelCategory;
import com.haohao.domain.novel.NovelChapter;
import com.haohao.domain.novel.NovelContent;

import java.util.List;

public interface NovelService {

    /**
     * 查询类目列表
     */
    List<NovelCategory> NovelCategoryList();

    /**
     * 根据id查询章节列表
     * @return
     */
    List<NovelChapter> NovelChapterList(Long id);

    /**
     * 根据id查询章节内容
     * @param id
     * @return
     */
    NovelContent findByNovelChapter(Long id);

    /***
     * 查询所有
     * @return
     */
    List<Novel> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Novel findById(Long id);

    /***
     * 新增
     * @param novel
     */
    void add(Novel novel);

    /***
     * 修改
     * @param novel
     */
    void update(Novel novel);

    /***
     * 删除
     * @param id
     */
    void delete(Long id);
}
