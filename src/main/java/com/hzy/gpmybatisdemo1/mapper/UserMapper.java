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

}
