package com.song.attendance.test;

import com.song.attendance.bean.Dept;
import com.song.attendance.dao.DeptMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-context.xml"})
public class DeptTest {
    @Autowired
    private DeptMapper deptMapper;

    @Test
    public void test(){
        List<Dept> dept = deptMapper.getDept();
        for (Dept d :
                dept) {
            System.out.println(d.toString());
        }

    }
}
