package com.example.demo.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Example.ExPrgm;
import com.example.demo.Repository.ExRepo;
@Service
public class ExService 
{
	@Autowired
	public ExRepo pser;
	public ExPrgm saveInfo(ExPrgm ex)
	{
		return pser.save(ex);
	}
	public void deleteDetails(int sid)
	{
		pser.deleteById(sid);
	}
	public List<ExPrgm> getInfo()
	{
		return pser.findAll();
	}
	public ExPrgm updateInfo(ExPrgm ali)
	{
		return pser.saveAndFlush(ali);
	}
	
}
