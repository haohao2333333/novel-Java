package com.haohao.novel.service.ipml;

import com.haohao.novel.domain.NovelContent;
import com.haohao.novel.dao.NovelContentDao;
import com.haohao.novel.service.NovelContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NovelContentServiceImpl implements NovelContentService {

    @Autowired
    private NovelContentDao novelContentDao;

    /**
     * 根据id查询章节内容
     * @param id
     * @return
     */
    public NovelContent findByNovelChapter(Long id){
        return novelContentDao.NovelContent(id);
    }

    /**
     * 添加小说内容
     * @param novelContent
     */
    public void add(NovelContent novelContent){
        novelContentDao.insert(novelContent);
    }

}
