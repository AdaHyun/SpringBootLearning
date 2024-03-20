package com.ada.mybatisplus.demo3.service;

import com.ada.mybatisplus.demo3.domain.Student;
import com.baomidou.mybatisplus.extension.service.IService;

public interface StudentService extends IService<Student> {

    void addStudent(Student student);

    void deleteStudentById(int id);

    void editStudent(Student student);

    Student selectStudent(int id);
}
