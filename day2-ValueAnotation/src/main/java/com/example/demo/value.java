package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

 @Controller
public class value {
	@Value("${sname}")
	public String sname;
	@ResponseBody
	@GetMapping("/anime")
	public String display()
	{
		return "I love "+sname;
	}

}


