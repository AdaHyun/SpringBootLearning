package com.ada.mybatisplus.demo3.controller;


import com.ada.mybatisplus.demo3.domain.Student;
import com.ada.mybatisplus.demo3.entity.Result;
import com.ada.mybatisplus.demo3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public Result addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return Result.success("添加学生成功");
    }

    @GetMapping("/select")
    public Result selectStudent(int id){

        return Result.success(studentService.selectStudent(id));
    }

    @DeleteMapping("/delete")
    public Result deleteStudent(int id){
        studentService.deleteStudentById(id);
        return Result.success("删除学生成功");
    }

    @PostMapping("/edit")
    public Result editStudent(@RequestBody Student student){
        studentService.editStudent(student);
        return Result.success("修改学生成功");
    }

}
