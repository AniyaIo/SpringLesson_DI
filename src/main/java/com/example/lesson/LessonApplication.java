package com.example.lesson;

import com.example.lesson.service.IProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LessonApplication {
	public static void main(String[] args) {
		//指定したファイルより下の階層をスキャンし、コンポーネントが無いか調べる
		var context = SpringApplication.run(LessonApplication.class, args);
		var userService = context.getBean(IProductService.class);


	}

}
