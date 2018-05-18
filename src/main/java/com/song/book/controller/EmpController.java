package com.song.book.controller;

import com.song.book.bean.Emp;
import com.song.book.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RequestMapping("/emp")
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/getAll")
    public String getAll(HttpServletRequest request){
        List<Emp> list = empService.getAll();
        request.setAttribute("list",list);
        return "/emp/EmpList";
    }
    @ResponseBody    //这个要加
    @RequestMapping("/deleteById")
    //需要返回值
    public boolean deleteById(@RequestParam("id") Integer id){
        int i = empService.deleteById(id);
        if (i != 0)
            return true;
        return false;
    }
    @ResponseBody    //这个要加
    @RequestMapping("/showById")
    //需要返回值
    public Emp showById(@RequestParam("id") Integer id){
        Emp emp = empService.getById(id);
        return emp;
    }
}

