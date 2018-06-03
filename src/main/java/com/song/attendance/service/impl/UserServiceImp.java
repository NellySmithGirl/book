package com.song.attendance.service.impl;

import com.song.attendance.bean.Emp;
import com.song.attendance.bean.User;
import com.song.attendance.dao.EmpMapper;
import com.song.attendance.dao.UserMapper;
import com.song.attendance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectByMap(Map<String, Object> map) {
        return userMapper.selectByMap(map);
    }
}
