package com.ada.mybatisplus.demo3.mapper;

import com.ada.mybatisplus.demo3.domain.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}

