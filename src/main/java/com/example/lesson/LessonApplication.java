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

		//findAll
//		var list = userService.findAll();
//		list.stream().forEach(System.out::println);

		//findById
//		System.out.println(userService.findById(2));
//

		//insert
//			System.out.println(userService.insert(new ProductRecord(1,"蛍光ペン(赤)",80)));

		//update
//		System.out.println(userService.update(new ProductRecord(2,"蛍光ペン(緑)",80)));
//		System.out.println(userService.update(new ProductRecord(5555,"蛍光ペン(緑)",80)));

		//delete
//		System.out.println(userService.delete(4));
//		System.out.println(userService.delete(5555));


	}

}
