package com.example.demo.AniController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AniService.loginser;
import com.example.demo.AnimeList.Login;


@RestController
public class logincontroller {
	@Autowired
	private loginser ser;
	
	@PostMapping("/chechdata")
	public String login(@RequestBody Map<String,String> loginData)
	{
		String ownername=loginData.get("ownername");
		String ownerpassword=loginData.get("ownerpassword");
		String result=ser.loginAccessCheck(ownername, ownerpassword);
		return result;
	}
	@PostMapping("/adduser")
	public Login addUser(@RequestBody Login lo)
	{
		return ser.addUser(lo);
	}
	@GetMapping("/getlog")
	public List<Login> listAll()
	{
		return ser.getData();
	}
	

}
