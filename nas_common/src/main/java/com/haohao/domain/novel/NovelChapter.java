package com.haohao.domain.novel;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
public class NovelChapter extends Novel {

    private Long novel_id;
    private Long chapter_num;
    private String chapter_name;

}
