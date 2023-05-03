package com.example.anime.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.anime.Model.*;
import com.example.anime.Service.loginser;
@RestController
public class logincontrol {
	@Autowired
	private loginser ser;
	
	@PostMapping("/cdata")
	public String loginmodel(@RequestBody Map<String,String> loginData)
	{
		String ownername=loginData.get("ownername");
		String ownerpassword=loginData.get("ownerpassword");
		String result=ser.loginAccessCheck(ownername,ownerpassword);
		return result;
	}
	@PostMapping("/cpost")
	public loginmodel addUser(@RequestBody loginmodel lom)
	{
		return ser.addUser(lom);
	}
	@GetMapping("/cget")
	public List<loginmodel> listAll()
	{
		return ser.getData();
	}

}
