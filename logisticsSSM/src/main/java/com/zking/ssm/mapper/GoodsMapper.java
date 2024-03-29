package com.zking.ssm.mapper;

import com.zking.ssm.model.Goods;
import org.springframework.stereotype.Service;

@Service
public interface GoodsMapper {
    int deleteByPrimaryKey(String gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(String gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    /**
     * 增加货物的方法
     */
    int addGoods(Goods goods);

}