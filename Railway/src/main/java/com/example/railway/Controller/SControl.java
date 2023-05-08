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

import com.example.railway.RailwayData.StationInfo;
import com.example.railway.Repository.SRepo;
import com.example.railway.Service.Sservice;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/req")
public class SControl {
		@Autowired
		public SRepo srepo;
		
		@Autowired
		public Sservice ser;
		@PostMapping("/dpost")
		public StationInfo saveDetails(@RequestBody StationInfo sta)
		{
			return srepo.save(sta);
		}
		@GetMapping("/getal")
		public List<StationInfo> getall()
		{
			return srepo.getAllData();
		} 
		@GetMapping("/getbyid")
		public List<StationInfo> getDetails(int id)
		{
			return srepo.bystnid(id);
		}
		@PutMapping("/putall/{id}/{sname}")
		public StationInfo updateDetails(@PathVariable("id")int id,@PathVariable("sname")String sname)
		{
			return srepo.update(id, sname);
		}
		@GetMapping("/geta/{start}/{end}")
		public List<StationInfo> getBetween(@PathVariable("start") int start,@PathVariable("end") int end)
		{
			return srepo.startend(start, end);
		}
		@DeleteMapping("/delete/{id}/{sname}")
		public String deleteDetails(@PathVariable("id")int id,@PathVariable("sname")String sname)
		{
			srepo.deletebyId(id, sname);
			return "Deleted";
		}
		@GetMapping("/getqu/{name}")
		public StationInfo getbyname(@PathVariable("name") String name)
		{
			return srepo.queryByType(name);
		}
		@DeleteMapping("/bybidname/{id}/{name}")
		public String deletebyid(@PathVariable int id,@PathVariable String name)
		{
			srepo.deletebyId(id, name);
			return "Deleted";
		}		
		@Tag(name = "Post Method for StationInfo",description = "Post Details")
		@PostMapping("/ipost")
		public StationInfo postDetails(@RequestBody StationInfo sh)
		{
			return ser.saveData(sh);
		}
		
		@Tag(name = "Update by ID Method for StationInfo",description = "Update Details")
		@PutMapping("/iput/{name}/{id}")
		public StationInfo updateInfo(@PathVariable("id")int id,@PathVariable("cname") String cname)
		{
			return srepo.update(id, cname);
		}
		@GetMapping("/gbetween")
		public List<StationInfo> getbetween(@PathVariable("start") int start,@PathVariable("end") int end)
		{
			return srepo.between(start, end);
		}
		
		@GetMapping("/like")
		public List<StationInfo> likedata()
		{
			return srepo.like();
		}
		
		@PutMapping("/update/{cname}/{id}")
		public StationInfo updateDetails(@PathVariable("cname") String cname,@PathVariable("id") int id)
		{
			return srepo.queryUpdateDetails(cname, id);
		}
		
		@DeleteMapping("/deletequery/{id}")
		public void delete(@PathVariable("id") int id)
		{
			srepo.queryDelete(id);
		}
}
