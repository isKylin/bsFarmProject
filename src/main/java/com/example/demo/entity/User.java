package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user_login")
@KeySequence("user_id")
public class User implements Serializable {
    @TableField("user_id")
    private String userId;

    @TableField("user_name")
    private String userName;

    @TableField("user_pass")
    private String userPass;

    @TableField("cn_des")
    private String cnDes;
}
