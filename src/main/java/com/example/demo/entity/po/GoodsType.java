package com.example.demo.entity.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
public class GoodsType implements Serializable {
    private String goodsTypeId; // 类别id
    private String goodsType;   // 类别

    public GoodsType(String goodsType) {
        this.goodsTypeId = UUID.randomUUID().toString();
        this.goodsType = goodsType;
    }
}
