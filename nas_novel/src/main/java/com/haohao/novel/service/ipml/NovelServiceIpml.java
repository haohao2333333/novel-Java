package com.haohao.novel.service.ipml;

import com.haohao.domain.novel.NovelCategory;
import com.haohao.domain.novel.NovelChapter;
import com.haohao.domain.novel.NovelContent;
import com.haohao.novel.dao.NovelCategoryDao;
import com.haohao.novel.dao.NovelChapterDao;
import com.haohao.novel.dao.NovelContentDao;
import com.haohao.novel.dao.NovelDao;
import com.haohao.novel.service.NovelService;
import com.haohao.domain.novel.Novel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelServiceIpml implements NovelService {

    @Autowired
    private NovelDao novelDao;

    @Autowired
    private NovelChapterDao novelChapterDao;

    @Autowired
    private NovelContentDao novelContentDao;

    @Autowired
    private NovelCategoryDao novelCategoryDao;

    /**
     * 查询小说类目列表
     */
    public List<NovelCategory> NovelCategoryList() {
        return novelCategoryDao.selectList(null);
    }

    /**
     * 根据novel.id查询所有章节列表
     * @param id
     * @return
     */
    public List<NovelChapter> NovelChapterList(Long id){
        return novelChapterDao.NovelChapterList(id);
    }

    /**
     * 根据id查询章节内容
     * @param id
     * @return
     */
    public NovelContent findByNovelChapter(Long id){
        return novelContentDao.NovelContent(id);
    }

    /**
     * 查询所有
     * @return
     */
    public List<Novel> findAll() {
        return novelDao.selectList(null);
    }

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Novel findById(Long id){
        return  novelDao.selectById(id);
    }

    /**
     * 增加
     * @param novel
     */
    public void add(Novel novel){
        novelDao.insert(novel);
    }


    /**
     * 修改
     * @param novel
     */
    public void update(Novel novel){
        novelDao.updateById(novel);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(Long id){
        novelDao.deleteById(id);
    }


}