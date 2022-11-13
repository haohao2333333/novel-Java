package com.haohao.domain.novel;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("novel")
public class Novel implements Serializable {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    // 小说名
    private String novel_name;
    // 小说简介
    private String novel_desc;
    // 作者ID
    private Long author_id;
    // 作者名
    private String author_name;
    // 图片url
    private String img;
    // 类别ID
    private Long category_id;
    // 类别名
    private String category_name;

}
