package com.gk.gkhealth.service;

import com.gk.gkhealth.entity.Student;
import org.springframework.data.domain.Page;

public interface StudentService {
    Student save(Student student);
    void delete(Integer id);
    Student findStuById(Integer id);
    Page<Student> findAll(int page, int pageSize);
}
