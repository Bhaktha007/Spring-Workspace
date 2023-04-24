package com.example.demo.Controller;

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
	@GetMapping("/get")
	public Alist updateDetails(@RequestBody Alist al) {
		return ser.updateDetails(al);
	}
	@DeleteMapping("/delete")
	public String deleteDetails(@PathVariable("id")String id)
	{
		ser.deleteDetails(id);
		return id+" was deleted successfully";
	}
	@PutMapping("/update")
	public Alist getDetails(@RequestBody Alist al)
	{
		return ser.getDetails(al);
	}

}
