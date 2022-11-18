package com.haohao.novel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haohao.domain.novel.NovelChapter;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NovelChapterDao extends BaseMapper<NovelChapter> {

//    @Select("select n.*,ns.* from novel n join novel_chapter ns on n.id=ns.novel_id where n.id = #{id}")
    @Select("select ns.id,ns.novel_id,ns.chapter_num,ns.chapter_name,n.novel_name,n.novel_desc,n.author_name,n.category_name,n.img from novel n join novel_chapter ns on n.id=ns.novel_id where n.id = #{id}")
    List<NovelChapter> NovelChapterList(Long id);

}
