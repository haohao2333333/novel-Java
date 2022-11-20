package com.haohao.user.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
public class SysUser implements Serializable {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long user_id;
    private String username;
    private String password;
    private String user_role;
    private String name;
    private String email;
    private Integer state;

}
