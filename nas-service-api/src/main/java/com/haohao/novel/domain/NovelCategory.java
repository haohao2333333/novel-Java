package com.haohao.novel.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("novel_category")
public class NovelCategory {

    // 类目ID
    private Long id;
    // 类目名称
    private String name;

}
