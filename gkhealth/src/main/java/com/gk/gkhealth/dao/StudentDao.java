package com.gk.gkhealth.dao;

import com.gk.gkhealth.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentDao extends JpaRepository<Student,Integer> {
    //简单的增删改查不需要写，这个只不过为了辨别写了个名，不写也有底层的findById方法
    Student findStudentById(Integer id);
    //稍复杂的SQL语句需要自定义，格式如下
    @Query(name = "findStuByName",nativeQuery = true,value = "select * from student where name=:name")
    List<Student> findStuByName(@Param("name") String name);
}
