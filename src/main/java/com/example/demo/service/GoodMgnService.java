package com.example.demo.service;

import com.example.demo.dto.GoodDTO;
import com.example.demo.entity.Goods;
import com.example.demo.exception.BusinessException;
import com.example.demo.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodMgnService {
    @Autowired
    GoodsMapper goodsMapper;

    public GoodDTO getGoodById(int id) throws BusinessException {
        Goods good = goodsMapper.getGoodsById(id);
        GoodDTO goodDTO = new GoodDTO();
        if(good == null) {
            throw new BusinessException();
        } else {
            BeanUtils.copyProperties(good,goodDTO);
            return goodDTO;
        }
    }

    public GoodDTO[] getAllGoods() {
        return goodsMapper.getAllGoods().stream().map(goods -> {
            GoodDTO goodDTO = new GoodDTO();
            BeanUtils.copyProperties(goods,goodDTO);
            return goodDTO;
        }).toArray(GoodDTO[]::new);
    }
}
