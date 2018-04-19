package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Chap1Controller {
	@RequestMapping("/")
	String home()
	{
		return "Hello World";
	}
}
