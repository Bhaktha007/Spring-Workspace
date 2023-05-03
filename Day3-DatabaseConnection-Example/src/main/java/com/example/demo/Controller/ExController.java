package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.Example.ExPrgm;
import com.example.demo.Repository.ExRepo;
import com.example.demo.Service.ExService;
@RestController
public class ExController 
{
	@Autowired
	public ExService eser;
	@Autowired
	public ExRepo repo;
	@PostMapping("/control")
	public ExPrgm addDetails(@RequestBody ExPrgm exe)
	{
		return eser.saveInfo(exe);
	}
	@DeleteMapping("/delete/{sid}")
	public String deleteDetails(@PathVariable("sid")int sid)
	{
		eser.deleteDetails(sid);
		return sid+" was successfully deleted ";
	}
	@GetMapping("/get")
	public List<ExPrgm> getDetails()
	{
		return eser.getInfo();
	}
	@PutMapping("/put")
	public ExPrgm updateInfo(@RequestBody ExPrgm al)
	{
		return eser.updateInfo(al);
	}
	@GetMapping("/savedata")
	public List<ExPrgm> saveAllDetails()
	{
		return repo.getAllData();
	}
	@GetMapping("/startend/{start}/{end}")
	public List<ExPrgm> startEnd(@Param("sstart")int start,@Param("send")int send)
	{
		return repo.startEnd(start,send);
	}

}
