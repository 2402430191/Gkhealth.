package com.gk.gkhealth.service;

import com.github.pagehelper.Page;
import com.gk.gkhealth.entity.Student;

import java.util.Optional;

public interface StudentService {
    Student save(Student student);
    void delete(Integer id);
    Student findStuById(Integer id);
    Page<Student> findAll(int page, int pageSize);
}
