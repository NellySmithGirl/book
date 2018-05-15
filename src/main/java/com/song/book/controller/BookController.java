package com.song.book.controller;

import com.song.book.bean.Book;
import com.song.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @ResponseBody
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Book get(@PathVariable(value = "id") Integer id){

        return bookService.get(id);
    }

    @RequestMapping()
    public String list(HttpServletRequest request){
        request.setAttribute("name","西游记");
        return "/book/BookList";
    }
}
