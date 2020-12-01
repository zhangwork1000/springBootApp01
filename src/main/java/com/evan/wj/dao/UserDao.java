package com.evan.wj.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.evan.wj.pojo.User;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}