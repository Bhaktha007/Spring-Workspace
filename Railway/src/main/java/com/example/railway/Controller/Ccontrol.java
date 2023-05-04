package com.example.railway.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.railway.RailwayData.CustomerInfo;
import com.example.railway.Repository.CRepo;
import com.example.railway.Service.CService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/reqm")
public class Ccontrol {

			@Autowired
			public CRepo repo;
			
			@Autowired
			public CService dser;
			@PostMapping("/post")
			public CustomerInfo saveDetails(@RequestBody CustomerInfo cust)
			{
				return dser.saveDetails(cust);
			}
			@GetMapping("/getallac")
			public List<CustomerInfo> getall()
			{
				return repo.getAllData();
			}
			@GetMapping("/getbyid")
			public List<CustomerInfo> getDetails(int id)
			{
				return repo.bycusid(id);
			}
			@PutMapping("/put/{id}/{cname}")
			public CustomerInfo updateDetails(@PathVariable("id")int id,@PathVariable("cname")String cname)
			{
				return repo.update(id, cname);
			}
			@GetMapping("/get/{start}/{end}")
			public List<CustomerInfo> getBetween(@PathVariable("start")int start,@PathVariable("end")int end)
			{
				return repo.startend(start,end);
			}
			@DeleteMapping("/delete/{id}/{cname}")
			public String deleteDetails(@PathVariable("id")int id,@PathVariable("cname")String cname)
			{
				repo.deletebyId(id, cname);
				return "Deleted";
			}
			
			@GetMapping("/getquery/{name}")
			public CustomerInfo getquery(@PathVariable("name")String name)
			{
				return repo.queryByTypeD(name);
			}
			
			@DeleteMapping("/bybidname/{id}/{name}")
			public String deletebyid(@PathVariable int id,@PathVariable String name)
			{
				repo.deletebyId(id, name);
				return "Deleted";
			}
			
			@Tag(name = "Get Method for CustomerInfo",description = "User Validation")
			@GetMapping("/getBetween")
			public List<CustomerInfo> getBetweenData(@PathVariable("start")int start,@PathVariable("end")int end)
			{
				return repo.betweenD(start, end);
			}
			@GetMapping("/getlike")
			public List<CustomerInfo> likedata()
			{
				return repo.Dlike();
			}
			@PutMapping("/updatequery/{name}/{id}")
			public CustomerInfo updateQuery(@PathVariable("name")String name,@PathVariable("id")int id)
			{
				return repo.queryUpdateDetails(name, id);
			}
			@DeleteMapping("/deletequery/{id}")
			public void deleteQuery(@PathVariable("id")int id)
			{
				repo.queryDeleteD(id);
			}
}
