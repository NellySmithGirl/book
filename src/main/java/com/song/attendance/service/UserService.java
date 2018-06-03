package com.song.attendance.service;

import com.song.attendance.bean.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserService {

    int deleteById(Integer id);

    User getById(Integer id);

    List<User> selectByMap(Map<String, Object> map);
}
