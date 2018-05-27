package com.song.attendance.service;

import com.song.attendance.bean.User;

import java.util.List;

public interface UserService {

    int deleteById(Integer id);

    User getById(Integer id);
}
