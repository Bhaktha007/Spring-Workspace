package com.example.demo.AniController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AniRepository.AniRepo;
import com.example.demo.AniService.Aservice;
import com.example.demo.AnimeList.Alist;

@RestController
public class Anicontrol {
		@Autowired
		public Aservice lser;
		@Autowired
		public AniRepo lrep;
		@PostMapping("/ldbms")
		public Alist addDetails(@RequestBody Alist lb)
		{
			return lser.saveInfo(lb);
		}
		
		@GetMapping("/lget/{id}")
		public Optional<Alist> getDetails(@PathVariable("id")int id)
		{
			return lser.getInfo(id);
		}
		@GetMapping("/lgetre")
		public List<Alist> getDataRe()
		{
			return lser.getData();
		}
		@DeleteMapping("/ldelete/{id}")
		public String deletedetails(@PathVariable("id")int id)
		{
			lser.deletedetails(id);
			return "Deltion was Successful";
		}
		@PutMapping("/lupdate")
		public Alist updateDetails(@RequestBody Alist ld)
		{
			return lser.updateDetails(ld);
		}
		@DeleteMapping("/deleteByReq")
		public String deleteReqByPara(@RequestParam("id")int id)
		{
			lser.deletedetails(id);
			return id+" deletion was successful";
		}
		@GetMapping("/sortasc/{lname}")
		public List<Alist> sortDetailsAsc(@PathVariable("lname")String lname)
		{
			return lser.sortAsc(lname);
		}
		@GetMapping("/sortdesc/{lname}")
		public List<Alist> sortDetailsDesc(@PathVariable("lname")String lname)
		{
			return lser.sortDesc(lname);
		}
		@GetMapping("/paginationD/{pno}/{pgs}")
		public List<Alist> paginationData(@PathVariable("pno")int pno,@PathVariable("pgs")int pgs)
		{
			return lser.paginationD(pno, pgs);
		}
		@GetMapping("/paginationS/{pno}/{pgs}/{lname}")
		public List<Alist> paginationSort(@PathVariable("pno")int pno,@PathVariable("pgs")int pgs,@PathVariable("lname")String lname)
		{
			return lser.sortDesc(lname);
		}
		@PostMapping("/login")
		public String login(@RequestBody Map<String,String> loginDataMap)
		{
			String username = loginDataMap.get("username");
			String password = loginDataMap.get("password");
			String result = lser.loginCheckData(username, password);
			return result;
		}
		@GetMapping("/alldata")
		public List<Alist> getData()
		{
			return lrep.getAllData();
		}
		@GetMapping("/byuserid/{id}")
		public List<Alist> getbyuserid(@PathVariable("id")int id)
		{
			return lrep.byuserid(id);
		}
		@GetMapping("/startend/{start}/{end}")
		public List<Alist> startend(@PathVariable("start")int start,@PathVariable("end")int end)
		{
			return lrep.startend(start, end);
		}
		@DeleteMapping("/deletebyid/{id}/{name}")
		public String deleteCar(@PathVariable("id")int id,@PathVariable("name")String name)
		{
			lrep.deletebyId(id, name);
			return id+" was deleted";
		}
		@PutMapping("/updatequery/{id}/{uname}")
		public String updateQuery(@PathVariable("id")int id,@PathVariable("uname")String uname)
		{
			lrep.updateDetails(id, uname);
			return "updated";
		}
}

