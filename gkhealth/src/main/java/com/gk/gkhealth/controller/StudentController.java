package com.gk.gkhealth.controller;



import com.gk.gkhealth.entity.Student;
import com.gk.gkhealth.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public Student save(Student student){
        return studentService.save(student);
    }

    @PostMapping("/update")
    public Student update(Student student){
        Student s=studentService.findStuById(student.getId());
        s.setStudentName(student.getStudentName());
        s.setClazzId(student.getClazzId());
        s.setImage(student.getImage());
        s.setPassword(student.getPassword());
        s.setSex(student.getSex());
        s.setStudentId(student.getStudentId());
        return s;
    }

    @GetMapping("/del/{id}") //get请求 RESTful风格
    public String del(@PathVariable int id) {
        studentService.delete(id);
        return "yes";
    }

    @GetMapping("/query")
    public Page<Student> findByPage(Integer page, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin","*");//解决跨域请求

        if (page == null || page <= 0) {
            page = 0;
        } else {
            page -= 1;
        }
        return studentService.findAll(page, 5);
    }

}
