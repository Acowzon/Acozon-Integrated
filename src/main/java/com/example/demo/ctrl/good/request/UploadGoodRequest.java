package com.example.demo.ctrl.good.request;

public class UploadGoodRequest {

    private String goodsId; // 商品id
    private String goodsName; // 商品名称
    private String goodsTypeId; // 商品类型
    private double goodsPrice; // 商品价格
    private String goodsImage; // 商品图片的存储地址
    private String goodsSimpleDes; // 商品的简单描述
    private String goodsDescription; // 商品的描述
    private int goodsInventory; // 商品库存
    private int retailerId; // 商品上架商家的id

    @Override
    public String toString() {
        return "UploadGoodRequest{" +
                "goodsId='" + goodsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsTypeId='" + goodsTypeId + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsImage='" + goodsImage + '\'' +
                ", goodsSimpleDes='" + goodsSimpleDes + '\'' +
                ", goodsDescription='" + goodsDescription + '\'' +
                ", goodsInventory=" + goodsInventory +
                ", retailerId=" + retailerId +
                '}';
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getGoodsSimpleDes() {
        return goodsSimpleDes;
    }

    public void setGoodsSimpleDes(String goodsSimpleDes) {
        this.goodsSimpleDes = goodsSimpleDes;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public int getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(int goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    public int getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(int retailerId) {
        this.retailerId = retailerId;
    }
}
