package com.zking.ssm.mapper;

import com.zking.ssm.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 用户登录的方法
     * @param user
     * @return
     */
    boolean UserLogin(User user);


}