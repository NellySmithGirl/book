package com.song.book.service;

import com.song.book.bean.Emp;

import java.util.List;

public interface EmpService {

    List<Emp> getAll();

    int deleteById(Integer id);

    Emp getById(Integer id);
}
