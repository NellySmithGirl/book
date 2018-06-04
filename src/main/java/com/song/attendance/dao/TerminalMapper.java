package com.song.attendance.dao;

import com.song.attendance.bean.Terminal;

public interface TerminalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Terminal record);

    int insertSelective(Terminal record);

    Terminal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Terminal record);

    int updateByPrimaryKey(Terminal record);
}