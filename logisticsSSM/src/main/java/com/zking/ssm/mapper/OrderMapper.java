package com.zking.ssm.mapper;

import com.zking.ssm.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderMapper {
    int deleteByPrimaryKey(String oid);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //根据用户id查询所有数据
    List<Order> selectByUid(Integer uid);

    List<Order> selectByCX(Integer uid, String oid,String blno,String qyz,String mdz);

    /**
     * 添加订单的方法
     * @param record
     * @return
     */
    int addOrder(Order record);

}