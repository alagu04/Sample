package org.project.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler
{
	@RequestMapping("/hello")
	public List<String> sayHai(){
		return (List<String>) Arrays.asList("sf","agf");
	}

}
