package com.song.book.dao;

import com.song.book.bean.Emp;
import com.song.book.bean.EmpCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface EmpMapper {
    long countByExample(EmpCriteria example);

    int deleteByExample(EmpCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpCriteria example);

    Emp selectByPrimaryKey(Integer id);

    List<Emp> selectByExampleWithDept(EmpCriteria example);

    Emp selectByPrimaryKeyWithDept(Integer id);

    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpCriteria example);

    int updateByExample(@Param("record") Emp record, @Param("example") EmpCriteria example);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}