package com.example.demo.service.impl;

import com.example.demo.domain.User;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User selectById(User user) {
        return userMapper.selectOne(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByExample(user,null);
    }
}
