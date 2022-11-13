package com.haohao.domain.novel;

import lombok.Data;

@Data
public class NovelContent extends NovelChapter{

    private Long chapter_id;
    private String content;

}
