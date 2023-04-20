package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class anime {
	@Value("${name:Bleach}")
	public String name;
	@GetMapping("/anime")
	public String display()
	{
		return "one of the big three anime is "+name;
	}

}
