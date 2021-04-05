package com.example.demo.service.good;

import com.example.demo.dto.good.GoodDTO;

import com.example.demo.entity.po.Goods;
import com.example.demo.exception.BusinessException;
import com.example.demo.mapper.good.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

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
