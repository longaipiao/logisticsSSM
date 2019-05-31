package com.zking.ssm.service;

import com.zking.ssm.model.Order;
import org.springframework.stereotype.Service;

public interface OrderService {
    int deleteByPrimaryKey(String oid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}