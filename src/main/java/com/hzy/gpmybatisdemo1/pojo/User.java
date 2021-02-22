package com.hzy.gpmybatisdemo1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private String name;

    private Integer age;
}
