package com.hzy.gpmybatisdemo1.controller;

import com.hzy.gpmybatisdemo1.pojo.User;
import com.hzy.gpmybatisdemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName UserController
 * @Aauthor zhengyang.hu
 * @Date 2021/2/22
 **/
@Controller
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/user/query")
    public String query(Model model){
        List<User> query = service.query(null);
        model.addAttribute("list",query);
        return "user";
    }

    @RequestMapping("/{page}")
    public String page(String page){
        return page;
    }

}
