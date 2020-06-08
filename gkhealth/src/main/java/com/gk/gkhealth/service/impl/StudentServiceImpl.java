package com.gk.gkhealth.service.impl;

import com.github.pagehelper.Page;
import com.gk.gkhealth.dao.StudentDao;
import com.gk.gkhealth.entity.Student;
import com.gk.gkhealth.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public void delete(Integer id) {
        studentDao.deleteById(id);
    }

    @Override
    public Student findStuById(Integer id) {
        return studentDao.findStudentById(id);
    }

    @Override
    public Page<Student> findAll(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return (Page<Student>) studentDao.findAll(pageable);
    }
}
