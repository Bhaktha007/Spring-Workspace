package com.example.anime.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.anime.Model.AnimeModel;
import com.example.anime.Repository.AnimeRepo;

@Service
public class AnimeService {
	
	@Autowired
	public AnimeRepo arep;
	
	public AnimeModel saveInfo(AnimeModel am)
	{
		return arep.save(am);
	}
	public AnimeModel updateInfo(AnimeModel amu)
	{
		return arep.saveAndFlush(amu);
	}
	public List<AnimeModel> getInfo()
	{
		return arep.findAll();
	}
	public void deleteInfo(int id)
	{
		arep.deleteById(id);
	}
	public List<AnimeModel> sortDesc(String name)
	{
		return arep.findAll(Sort.by(name).descending());
	}
	public List<AnimeModel> paginationData(int pno,int psize)
	{
				Page<AnimeModel> p=arep.findAll(PageRequest.of(pno, psize));
				return p.getContent();
	}
	public List<AnimeModel> paginationSorting(int pno,int psize,String name)
	{
		Page<AnimeModel> p=arep.findAll(PageRequest.of(pno, psize, Sort.by(name).descending()));
		return p.getContent();
	}

}
