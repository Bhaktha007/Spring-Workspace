package com.example.project.Controller;
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

import com.example.project.Model.LoanApplicationModel;
import com.example.project.Service.LoanApplicationService;

@RestController
@RequestMapping("/loan")
public class LoanApplicationController {
	
	@Autowired
	LoanApplicationService lser;
	@GetMapping(value="/getAllLoans")
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=lser.get();
		return l;
	}
	@PostMapping("/signup")
	public LoanApplicationModel addDetails(@RequestBody LoanApplicationModel u)
	{
		return lser.saveUser(u);
	}
	@DeleteMapping(value="/{id}")
	public String deleteById(@PathVariable int id)
	{
		lser.deleteByID(id);
		return "Deleted";
	}
	@PutMapping("/put")
	public LoanApplicationModel update(@RequestBody LoanApplicationModel um)
	{
	    return lser.update(um);	
	}


}
