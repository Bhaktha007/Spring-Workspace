package com.example.anime.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.anime.Model.loginmodel;
import com.example.anime.Repository.loginRepo;

@Service
public class loginser {
	@Autowired
	private loginRepo repo;
	
	public String loginAccessCheck(String ownername,String ownerpassword)
	{
		loginmodel user=repo.findByownername(ownername);
		if(user == null)
		{
			return "No User Found By that Name !!!! Please try again";
		}
		else
		{
			if(user.getOwnerpassword().equals(ownerpassword))
			{
				return "login successfull";
			}
			else
			{
				return "login failed !! please try again";
			}
		}
	}
	public loginmodel addUser(loginmodel log)
	{
		return repo.save(log);
	}
	public List<loginmodel> getData()
	{
		return repo.findAll();
	}

}
