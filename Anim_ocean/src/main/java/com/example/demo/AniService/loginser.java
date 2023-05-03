package com.example.demo.AniService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AniRepository.loginrepo;
import com.example.demo.AnimeList.Login;

@Service
public class loginser {
	@Autowired
	private loginrepo repo;
	
	public String loginAccessCheck(String ownername,String ownerpassword)
	{
		Login user = repo.findByownername(ownername);
		if(user == null)
		{
			return "No User Found By that Name !!!! Please try again";
		}
		else
		{
			if(user.getOwnerpassword().equals(ownerpassword))
			{
			   return "Login Successfull";
			}
			else
			{
				return "Login failed !!! Please try again";
			}
		}
	}
	public Login addUser(Login log)
	{
		return repo.save(log);
	}
	public List<Login> getData()
	{
		return repo.findAll();
	}

}
