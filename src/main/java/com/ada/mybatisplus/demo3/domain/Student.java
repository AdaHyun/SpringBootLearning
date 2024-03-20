package com.ada.mybatisplus.demo3.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Student {
    private static final long serialVersionUID = 1L;

    @TableId
    private Integer id;

    private String name;

    private String gender;

    private String major;




}
