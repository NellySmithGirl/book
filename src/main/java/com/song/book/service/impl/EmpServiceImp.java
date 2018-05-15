package com.song.book.service.impl;

import com.song.book.bean.Emp;
import com.song.book.dao.EmpMapper;
import com.song.book.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImp implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> getAll() {
        return empMapper.selectAll();
    }
}
