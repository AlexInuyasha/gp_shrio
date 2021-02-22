package com.hzy.gpmybatisdemo1.service;

import com.hzy.gpmybatisdemo1.pojo.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Aauthor zhengyang.hu
 * @Date 2021/2/22
 **/
public interface UserService {
    public List<User> query(User user);

    public Integer addUser(User user);

    public User queryById(Integer id);

    public Integer updateUser(User user);
    public Integer deleteUserById(Integer id);
}
