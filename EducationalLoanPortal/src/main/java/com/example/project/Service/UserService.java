package com.example.project.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.LoanApplicationModel;
import com.example.project.Model.UserModel;
import com.example.project.Repository.LoanApplicationRepo;
import com.example.project.Repository.UserRepo;
@Service
public class UserService {
	@Autowired
	UserRepo userRep;
	@Autowired
	LoanApplicationRepo lRep;
	public UserModel saveUser(UserModel l)
	{
		return userRep.save(l);
	}
	public String valideteUser(String email,String password)
	{
		String result=" ";
		UserModel l=userRep.findByEmail(email);
		if(l==null)
		{
			result="User not found";
		}
		else
		{
			if(l.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
		return result;
	}
	public List<UserModel> get()
	{
		List<UserModel> um=userRep.findAll();
		return um;
	}
	public LoanApplicationModel getById(int id)
	{
		LoanApplicationModel gbi=lRep.findById(id).get();
		return gbi;
		
	}
	public void deleteByID(int id) {
		userRep.deleteById(id);
	}
	public UserModel update(UserModel um) {
		return userRep.saveAndFlush(um);
	}

}
