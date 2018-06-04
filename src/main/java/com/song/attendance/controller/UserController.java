package com.song.attendance.controller;

import com.song.attendance.bean.User;
import com.song.attendance.service.UserService;
import com.song.attendance.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;


@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/deleteById")
    //需要返回值
    public boolean deleteById(@RequestParam("id") Integer id){
        int i = userService.deleteById(id);
        if (i != 0)
            return true;
        return false;
    }
    @ResponseBody
    @RequestMapping("/login")
    //需要返回值
    public boolean login(
            @RequestParam("account") String account,
            @RequestParam("passWord") String passWord
    ){
        HashMap<String, Object> map = new HashMap<>();
        List<User> users = userService.selectByMap(map);
        return false;
    }
    @ResponseBody    //这个要加
    @RequestMapping(value = "/get/{id}")
    public Response showById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return Response.ok(user);
    }
}
