package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.PriceMapper;
import com.zking.ssm.model.Price;
import com.zking.ssm.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("priceService")
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceMapper priceMapper;

    @Override
    public int deleteByPrimaryKey(String pid) {
        return 0;
    }

    @Override
    public int insert(Price record) {
        return 0;
    }

    @Override
    public int insertSelective(Price record) {
        return 0;
    }

    @Override
    public Price selectByPrimaryKey(String pid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Price record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Price record) {
        return 0;
    }
}
