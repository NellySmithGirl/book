package com.song.book.dao;

import com.song.book.bean.Emp;

import java.util.List;
public interface EmpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer id);

    List<Emp> selectAll();

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}