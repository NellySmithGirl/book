package com.song.book.service.impl;

import com.song.book.bean.Book;
import com.song.book.dao.BookMapper;
import com.song.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book get(Integer id) {
        return bookMapper.selectByPrimaryKey(id);
    }
    public void updatebook(){
        updateLog();
    }
    public void updateLog(){
        //insert into log 张三5月14号借走了西游记(id=1)
    }
}
