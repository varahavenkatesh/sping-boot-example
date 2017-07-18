package com.garage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NewController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello!";
	}

	@RequestMapping("/msg")
	public String testData() {
		return "Hello Venkatesh!";
	}
}
