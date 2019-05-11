package com.yuan.cn.mapper;

import com.yuan.cn.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User findUserByUserName(@Param("username") String username);
}
