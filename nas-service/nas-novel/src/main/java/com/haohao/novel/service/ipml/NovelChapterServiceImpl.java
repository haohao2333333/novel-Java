package com.haohao.novel.service.ipml;

import com.haohao.novel.domain.NovelChapter;
import com.haohao.novel.dao.NovelChapterDao;
import com.haohao.novel.service.NovelChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelChapterServiceImpl implements NovelChapterService {

    @Autowired
    private NovelChapterDao novelChapterDao;

    /**
     * 根据novel.id查询所有章节列表
     * @param id
     * @return
     */
    public List<NovelChapter> NovelChapterList(Long id){
        return novelChapterDao.NovelChapterList(id);
    }

    /**
     * 增加
     * @param novelChapter
     */
    public void add(NovelChapter novelChapter){
        novelChapterDao.insert(novelChapter);
    }

}
