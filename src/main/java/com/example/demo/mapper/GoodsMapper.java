package com.example.demo.mapper;

import com.example.demo.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

@Mapper
public interface GoodsMapper {
    // 查询所有的商品
    List<Goods> getAllGoods();

    // 根据指定的类别来查找商品
    List<Goods> getGoodsByType(@Param("type") String type);

    // 根据条件来查询
    List<Goods> queryGoodsByMap(Map map);

    // 根据id查询一个商品
    Goods getGoodsById(@Param("id") int id);

    // 添加一个商品
    int addGoods(Goods goods);

    // 增加商品的浏览数,views+1,不需要更新修改时间
    int addViews(@Param("id") int id);

    // 增加商品的喜欢数,不需要更新修改时间
    int addStars(@Param("id") int id);

    // 增加商品的售出数量,不需要更新修改时间
    int addSoldCount(@Param("id") int id, @Param("count") int count);

    // 商品的评论数+1,不需要更新修改时间
    int addComment(@Param("id") int id);

    // 修改商品信息
    int updateGoods(Map map);

    // 删除一个商品
    int delGoods(@Param("id") int id);
}
