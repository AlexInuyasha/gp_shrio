package com.hzy.gpmybatisdemo1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName User
 * @Aauthor zhengyang.hu
 * @Date 2021/2/22
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;

    private String username;
    private String password;
    private String salt;
    private Date creatTime;
    private Integer state;
    private Date lastLoginTime;
    private String nickname;
    private String realname;

    private Integer age;
}
