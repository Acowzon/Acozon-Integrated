package com.example.demo.mapper;

import com.example.demo.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

@Mapper
public interface GoodsMapper {
    // 查询所有的商品
    List<Goods> queryAllGoods();

    // 根据条件来查询
    List<Goods> queryGoodsByMap(Map map);

    // 根据id查询一个商品
    Goods queryGoodsById(@Param("id") String id);

    // 查询一个卖家的所有商品
    List<Goods> queryGoodsByRetailerId(@Param("id") String id);

    // 添加一个商品
    int addGoods(Goods goods);

    // 增加商品的浏览数,views+1,不需要更新修改时间
    int addViews(@Param("id") String id);

    // 增加商品的喜欢数,不需要更新修改时间
    int addStars(@Param("id") String id);

    // 增加商品的售出数量,不需要更新修改时间
    int addSoldCount(@Param("id") String id, @Param("count") int count);

    // 修改商品信息
    int updateGoods(Goods goods);

    // 删除一个商品
    int delGoods(@Param("id") String id);
}
