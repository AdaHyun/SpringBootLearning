package com.ada.mybatisplus.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ada")
public class MybatisPlusDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(MybatisPlusDemo3Application.class, args);
	}

}
