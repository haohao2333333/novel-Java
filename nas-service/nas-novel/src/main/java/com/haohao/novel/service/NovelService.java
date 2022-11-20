package com.haohao.novel.service;

import com.github.pagehelper.PageInfo;
import com.haohao.novel.domain.Novel;

import java.util.List;

public interface NovelService {

    PageInfo<Novel> getNovelsByPage(int pageNum,int pageSize);

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
