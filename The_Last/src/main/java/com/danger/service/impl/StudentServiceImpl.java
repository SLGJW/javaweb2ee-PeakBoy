package com.danger.service.impl;

import com.danger.dao.StudentDao;
import com.danger.domain.Student;
import com.danger.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
