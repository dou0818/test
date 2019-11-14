package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService{

    /**
     * 获取所有用户
     * @return
     */
    List<User> selectAll();

    /**
     * 根据用户id查询
     * @param user
     * @return
     */
    User selectById(User user);

    /**
     * 修改信息
     * @param user
     * @return
     */
    int updateUser(User user);

}
