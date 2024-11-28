package com.human.notice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.human.notice.repository")
public class NoticePritApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticePritApplication.class, args);
	}

}
