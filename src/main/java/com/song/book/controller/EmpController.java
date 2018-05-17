package com.song.book.controller;

import com.song.book.bean.Emp;
import com.song.book.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

