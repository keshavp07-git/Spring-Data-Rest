package com.keshav.Spring.Data.Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}
	// if we use Spring Data Rest then we don't have to use controller , it will be created by our repo
	// When we fetch data and response with it, we also get some links which redirect us to another data , which come along with our link.
	// and that link is know HATEAOS.
	// if we have JPA repo layer is ready we use it .
	// if we want to create RESTFUL Api web service we can use it ,
}
