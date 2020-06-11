package com.danger.dao;

import com.danger.domain.Teacher;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherDao {
    @Select("select * from teacher")
    List<Teacher> findAll();
}
