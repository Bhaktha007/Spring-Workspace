package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Example.ExPrgm;
import com.example.demo.Repository.ExRepo;
@Service
public class ExService 
{
	@Autowired
	public ExRepo pser;
	public ExPrgm saveInfo(ExPrgm ex)
	{
		return pser.save(ex);
	}
}
