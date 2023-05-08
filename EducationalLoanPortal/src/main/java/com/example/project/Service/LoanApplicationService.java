package com.example.project.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.LoanApplicationModel;
import com.example.project.Repository.LoanApplicationRepo;


@Service
public class LoanApplicationService {

	@Autowired
	LoanApplicationRepo laRep;
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laRep.findAll();
		return l;
	}

}
