package com.example.demo.ctrl.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetGoodDetailRequest {
    private Integer goodId;
}
