package com.haohao.novel.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("novel_content")
public class NovelContent extends NovelChapter{

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long chapter_id;
    private String content;

}
