package com.admin;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("com.admin.mapper")
public class HzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HzyApplication.class, args);
	}
}
