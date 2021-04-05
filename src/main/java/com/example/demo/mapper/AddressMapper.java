package com.example.demo.mapper;

import com.example.demo.entity.po.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AddressMapper {
    // 根据Id查询一个地址
    Address queryAddressById(@Param("id") String id);

    // 插入一个新的地址
    int addAddress(Address address);

    // 修改一个地址的信息
    int updateAddress(Address address);

    // 根据id删除一个地址
    int delAddressById(@Param("id") String id);
}
