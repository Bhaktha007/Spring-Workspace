package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Example.ExPrgm;
import com.example.demo.Service.ExService;
@RestController
public class ExController 
{
	@Autowired
	public ExService eser;
	@PostMapping("/control")
	public ExPrgm addDetails(@RequestBody ExPrgm exe)
	{
		return eser.saveInfo(exe);
	}
}
