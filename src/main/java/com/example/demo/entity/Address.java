package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Address implements Serializable{
    private String addressId;   // 地址id
    private String addressCountry;  // 国家
    private String addressProvince; // 省
    private String addressCity;     // 市
    private String detail;  // 具体地址

    public Address(String addressCountry, String addressProvince, String addressCity, String detail) {
        this.addressId = UUID.randomUUID().toString();
        this.addressCountry = addressCountry;
        this.addressProvince = addressProvince;
        this.addressCity = addressCity;
        this.detail = detail;
    }
}
