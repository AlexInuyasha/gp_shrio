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

    @RequestMapping("/user/save")
    public String addUser(User user){
        service.addUser(user);
        return "redirect:/user/query";
    }

    @RequestMapping("/{page}")
    public String page(String page){
        return page;
    }

    @RequestMapping("/user/updateInfo")
    public String updateInfo(Integer id,Model model){
        User user = service.queryById(id);
        model.addAttribute("user",user);
        return "updateUser";
    }

    @RequestMapping("/user/update")
    public String updateUser(User user){
        service.updateUser(user);
        return "redirect:/user/query";
    }

    @RequestMapping("/user/deleteUser")
    public String deleteUser(Integer id){
        service.deleteUserById(id);
        return "redirect:/user/query";
    }
}
