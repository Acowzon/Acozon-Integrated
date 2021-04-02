package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comments {
    private int CommentId; // 评论id
    private int CommentParentId; // 评论的父id
    private int goodsId; // 评论的商品id
    private int userId; // 用户id
    private String CommentText; // 评论内容
    private int Score; // 分数
    private Date commentTime; // 评论时间
}
