package com.hzy.gpmybatisdemo1.service.impl;

import com.hzy.gpmybatisdemo1.mapper.UserMapper;
import com.hzy.gpmybatisdemo1.pojo.User;
import com.hzy.gpmybatisdemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Aauthor zhengyang.hu
 * @Date 2021/2/22
 **/
@Service
public class UserServiceImpl implements UserService{

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public List<User> query(User user) {
        List<User> userList = userMapper.query(null);
        return userList;
    }

    @Override
    public Integer addUser(User user) {
        Integer integer = userMapper.addUser(user);
        return integer;
    }

    @Override
    public User queryById(Integer id) {
        User user = userMapper.queryById(id);
        return user;
    }

    @Override
    public Integer updateUser(User user) {
        Integer integer = userMapper.updateUser(user);
        return integer;
    }

    @Override
    public Integer deleteUserById(Integer id) {
        Integer integer = userMapper.deleteUserById(id);
        return integer;
    }


}
