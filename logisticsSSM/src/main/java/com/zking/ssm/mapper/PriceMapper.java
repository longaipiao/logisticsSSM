package com.zking.ssm.mapper;

import com.zking.ssm.model.Price;
import org.springframework.stereotype.Service;

@Service
public interface PriceMapper {


    int deleteByPrimaryKey(String pid);

    int insertSelective(Price record);

    Price selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(Price record);

    int updateByPrimaryKey(Price record);

    /**
     * 增加价钱的方法
     */
    int addPrice(Price record);
}