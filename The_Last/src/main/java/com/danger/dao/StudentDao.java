package com.danger.dao;

import com.danger.domain.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {


    @Select("select * from student")
    List<Student> findAll();
}
