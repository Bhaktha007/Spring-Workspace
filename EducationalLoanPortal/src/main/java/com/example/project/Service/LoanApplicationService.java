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
	public LoanApplicationModel saveUser(LoanApplicationModel u) {
		return laRep.save(u);
	}
	public void deleteByID(int id) {
		laRep.deleteById(id);
	}
	public LoanApplicationModel update(LoanApplicationModel um) {
		return laRep.saveAndFlush(um);
	}

}
