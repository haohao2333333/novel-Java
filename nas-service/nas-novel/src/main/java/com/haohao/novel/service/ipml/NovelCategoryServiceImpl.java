package com.haohao.novel.service.ipml;

import com.haohao.novel.domain.NovelCategory;
import com.haohao.novel.dao.NovelCategoryDao;
import com.haohao.novel.service.NovelCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelCategoryServiceImpl implements NovelCategoryService {

    @Autowired
    private NovelCategoryDao novelCategoryDao;

    /**
     * 查询小说类目列表
     */
    public List<NovelCategory> NovelCategoryList() {
        return novelCategoryDao.selectList(null);
    }


}
