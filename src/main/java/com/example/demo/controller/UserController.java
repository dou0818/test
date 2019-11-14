package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource(name = "userServiceImpl")
    UserService userService;

    @ResponseBody
    @GetMapping(value = "select")
    public List<User> selectAll(){
        List<User> userList=userService.selectAll();
        return userList;
    }

    @ResponseBody
    @RequestMapping(value = "selectbyid")
    public User selectById(int id){
        User user=new User();
        user.setId(id);
        return userService.selectById(user);
    }

    @ResponseBody
    @RequestMapping(value = "update")
    public int  update(User user){
        System.out.println("user.getId() = " + user.getId());
        return userService.updateUser(user);
    }


}
