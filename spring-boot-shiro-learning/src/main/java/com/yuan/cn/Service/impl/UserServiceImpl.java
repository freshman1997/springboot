package com.yuan.cn.Service.impl;

import com.yuan.cn.Service.UserService;
import com.yuan.cn.mapper.UserMapper;
import com.yuan.cn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUserName(String username) {
        return userMapper.findUserByUserName(username);
    }
}
