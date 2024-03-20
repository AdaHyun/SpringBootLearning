package com.ada.mybatisplus.demo3.service.impl;

import com.ada.mybatisplus.demo3.domain.Student;
import com.ada.mybatisplus.demo3.exception.ServiceException;
import com.ada.mybatisplus.demo3.mapper.StudentMapper;
import com.ada.mybatisplus.demo3.service.StudentService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl  extends ServiceImpl<StudentMapper,Student> implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public void addStudent(Student student) {
        LambdaQueryWrapper<Student> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Student::getName,student.getName());
        if (studentMapper.exists(wrapper)) {
            throw new ServiceException("该学生已经存在");
        }
        if (studentMapper.insert(student) <=0 ) {
            throw new ServiceException("添加学生失败");
        }
    }

    @Override
    public void deleteStudentById(int id) {
        LambdaQueryWrapper<Student> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Student::getId,id);
        if (studentMapper.deleteById(wrapper) <= 0) {
            throw new ServiceException("删除学生失败");
        }
    }



    @Override
    public void editStudent(Student student) {
        LambdaQueryWrapper<Student> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Student::getId,student.getId());
        if (studentMapper.updateById(student) <=0) {
            throw new ServiceException("修改学生失败");
        }
    }

    @Override
    public Student selectStudent(int id) {
        LambdaQueryWrapper<Student> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Student::getId,id);
        return studentMapper.selectOne(wrapper);
    }
}

