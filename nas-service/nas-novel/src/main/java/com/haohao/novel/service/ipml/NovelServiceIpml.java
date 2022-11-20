package com.haohao.novel.service.ipml;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haohao.novel.dao.NovelDao;
import com.haohao.novel.service.NovelService;
import com.haohao.novel.domain.Novel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelServiceIpml implements NovelService {

    @Autowired
    private NovelDao novelDao;

    /**
     * 分页查询
     * @param pageNum 页码
     * @param pageSize 页条数
     * @return
     */
    public PageInfo<Novel> getNovelsByPage(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Novel> novelpageList = novelDao.selectList(null);
        return new PageInfo<>(novelpageList);
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