package com.hzy.gpmybatisdemo1.mapper;

import com.hzy.gpmybatisdemo1.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Aauthor zhengyang.hu
 * @Date 2021/2/22
 **/
@Mapper
public interface UserMapper {

    public List<User> query(User user);

    public Integer addUser(User user);

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    public User queryById(Integer id);

    public Integer updateUser(User user);

    public Integer deleteUserById(Integer id);


}
