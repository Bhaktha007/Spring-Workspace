package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AnimeList.Alist;
import com.example.demo.Service.AService;


@RestController
public class AController 
{
	@Autowired
	public AService ser;
	@PostMapping("/add")
	public Alist addDetails(@RequestBody Alist ali)
	{
		return ser.saveInfo(ali);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id")int id)
	{
		ser.deleteDetails(id);
		return id+" was deleted successfully";
	} 
	@GetMapping("/get")
	public List<Alist> getDetails()
	{
		return ser.getInfo();
	}
	@PutMapping("/put")
	public Alist updateInfo(@RequestBody Alist al)
	{
		return ser.updateInfo(al);
	}
}
