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
}
