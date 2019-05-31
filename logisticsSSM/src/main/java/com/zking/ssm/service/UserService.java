package com.zking.ssm.service;

import com.zking.ssm.model.User;
import org.springframework.stereotype.Service;

public interface UserService {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}