package com.example.demo.AnimeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.demo.AnimeList.Alist;
import com.example.demo.AnimeRepository.AnimeRepo;

public class AniService {
	@Autowired
	public AnimeRepo repo;
	
	public Alist saveInfo(Alist al)
	{
		return repo.save(al);	
	}
	public Optional<Alist> getInfo(int id)
	{
		return repo.findById(id);
	}
	public List<Alist> getData()
	{
		return repo.findAll();
	}
	public void deleteDetails(int id)
	{
		repo.deleteById(id);
	}
	public List<Alist> sortDesc(String aname)
	{
		return repo.findAll(Sort.by(aname).descending());
	}
	public List<Alist> sortasc(String aname)
	{
		return repo.findAll(Sort.by(aname).ascending());
	}
	public List<Alist> paginationD(int pgno,int pgsi)
	{
		Page<Alist> p=repo.findAll(PageRequest.of(pgno, pgsi));
		return p.getContent();
	}
	public List<Alist> paginations(int pgno,int pgsi,String aname)
	{
		Page<Alist> ps=repo.findAll(PageRequest.of(pgno, pgsi,Sort.by(aname).descending()));
		return ps.getContent();
	}
	public Alist updateDetails(Alist ali) {
		// TODO Auto-generated method stub
		return repo.saveAndFlush(ali);
	}

}
