package com.temp.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootApplication {

	@Value(value = "${animal.name1}")
	private String name1;
	@Value(value = "${animal.name2}")
	private String name2;
	@Value(value = "${animal.name3}")
	private String name3;
	@Autowired
	private BookEntity book;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String index(){
//		return  "see you "+ name1+"--"+name2+"--"+name3;
		return book.getAuthor()+"--"+book.getName()+"--"+book.getPrice();
	}
}
