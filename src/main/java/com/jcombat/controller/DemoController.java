package com.jcombat.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String welcome(Map<String, Object> model) {
		return "welcome";
	}

	@GetMapping("/hello")
	public String sayHello(Map<String, Object> model) {
		return "welcome";
	}
}