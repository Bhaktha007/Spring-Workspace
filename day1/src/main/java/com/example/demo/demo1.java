package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demo1 
{
	@GetMapping("/haii")
	@ResponseBody
	public String display()
	{
		return "Hello World";
	}
}
