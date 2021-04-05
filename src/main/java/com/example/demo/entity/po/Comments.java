package com.example.demo.entity.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Comments implements Serializable{
    private String commentId; // 评论id
    private String goodsId; // 评论的商品id
    private String userId; // 用户id
    private String commentText; // 评论内容
    private int commentScore; // 分数
    private Date commentTime; // 评论时间

    public Comments(String goodsId, String userId, String commentText, int score) {
        this.commentId = UUID.randomUUID().toString();
        this.goodsId = goodsId;
        this.userId = userId;
        this.commentText = commentText;
        this.commentScore = score;
        this.commentTime = new Date();
    }
}
