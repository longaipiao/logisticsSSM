package com.zking.ssm.service;

import com.zking.ssm.model.Shipper;
import org.springframework.stereotype.Service;

public interface ShipperService {
    int deleteByPrimaryKey(String sid);

    int insert(Shipper record);

    int insertSelective(Shipper record);

    Shipper selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(Shipper record);

    int updateByPrimaryKey(Shipper record);

    /**
     * 增加发货人的方法
     * @param shipper
     * @return
     */
    int addShipper(Shipper shipper);

}