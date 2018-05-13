package com.song.book.dao;

import com.song.book.bean.Book;
import com.song.book.bean.BookCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    long countByExample(BookCriteria example);

    int deleteByExample(BookCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookCriteria example);

    Book selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookCriteria example);

    int updateByExample(@Param("record") Book record, @Param("example") BookCriteria example);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}