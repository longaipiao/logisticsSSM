package com.zking.ssm.mapper;

import com.zking.ssm.model.Shipper;

public interface ShipperMapper {
    int deleteByPrimaryKey(String sid);

    int insert(Shipper record);

    int insertSelective(Shipper record);

    Shipper selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(Shipper record);

    int updateByPrimaryKey(Shipper record);
}