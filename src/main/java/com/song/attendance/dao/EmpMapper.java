package com.song.attendance.dao;

import com.song.attendance.bean.Emp;

import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer id);

    List<Emp> getAll();

    List<Emp> getByEmp(Emp emp);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}