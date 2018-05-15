package com.song.book.test;

import com.song.book.dao.EmpMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-context.xml"})
public class EmpTest {
    @Autowired
    private EmpMapper empMapper;

    @Test
    public void test(){
//        Emp emp = new Emp();
//        emp.setName("李四");
//        emp.setGender("男");
//        emp.setEmail("李四@qq.com");
//        emp.setdId(1);
//        empMapper.insert(emp);
       /* Emp emp = empMapper.selectByPrimaryKey(1);
        System.out.println(emp.getName());*/
        empMapper.deleteByPrimaryKey(1);
    }
}
