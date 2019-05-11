package com.yuan.cn.druid.repository;

import com.yuan.cn.druid.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
