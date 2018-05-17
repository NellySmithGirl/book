package com.song.book.dao;

import com.song.book.bean.Dept;

import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    List<Dept> getDept();

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}