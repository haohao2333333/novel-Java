package com.haohao.novel.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("novel_chapter")
public class NovelChapter extends Novel {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long novel_id;
    private Long chapter_num;
    private String chapter_name;

}
