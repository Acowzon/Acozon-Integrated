package com.example.demo.dto.good;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodDTO {
    private int goodsId; // 商品id
    private String goodsName; // 商品名称
    private double goodsPrice; // 商品价格
    private String goodsImage; // 商品图片的存储地址
    private String goodsDescription; // 商品的描述
    private String goodsSimpleDes; // 商品的简单描述
    private int goodsInventory; // 商品库存
    private int soldCount; // 商品售出个数
}
