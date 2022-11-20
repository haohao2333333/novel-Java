package com.haohao.novel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haohao.novel.domain.NovelContent;
import org.apache.ibatis.annotations.Select;

public interface NovelContentDao extends BaseMapper<NovelContent> {

    @Select("SELECT n.*,n1.* from novel_chapter n join novel_content n1 on n.id = n1.chapter_id where n.id = #{id}")
    NovelContent NovelContent(Long id);

}
