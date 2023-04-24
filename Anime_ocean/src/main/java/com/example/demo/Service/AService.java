package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AnimeList.Alist;
import com.example.demo.Repository.ARepo;
@Service
public class AService 
{
	@Autowired
	public ARepo repo;
	
	public Alist saveInfo(Alist al)
	{
		return repo.save(al);
	}

	public void deleteDetails(int id) 
	{
		repo.deleteById(id);
	}
}
