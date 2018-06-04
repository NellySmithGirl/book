package com.song.book.controller;

import com.song.book.bean.Book;
import com.song.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book get(@PathVariable(value = "id") Integer id) {
        return bookService.get(id);
    }

    @RequestMapping("test")
    @ResponseBody
    public HashMap test(@RequestParam Long time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 22);
        return map;
    }

    @RequestMapping()
    public String list(HttpServletRequest request) {
        request.setAttribute("name", "西游记");
        return "/book/BookList";
    }
}
