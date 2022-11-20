package com.haohao.novel.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "Novel 小说类")
@TableName("novel")
public class Novel implements Serializable {

    /**
     * 主键
     */
    @ApiModelProperty(name = "id",value = "小说Id")
    @TableId(type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(name ="novel_name", value = "小说名")
    private String novel_name;

    @ApiModelProperty(name ="novel_desc", value = "小说简介")
    private String novel_desc;

    @ApiModelProperty(name ="author_id", value = "作者ID")
    private Long author_id;

    @ApiModelProperty(name ="author_name", value = "作者名")
    private String author_name;

    @ApiModelProperty(name ="img", value = "图片url")
    private String img;

    @ApiModelProperty(name ="category_id", value = "类别ID")
    private Long category_id;

    @ApiModelProperty(name ="category_name", value = "类别名")
    private String category_name;

}
