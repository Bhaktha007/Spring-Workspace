package com.example.anime.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.anime.Model.AnimeModel;
import com.example.anime.Service.AnimeService;

@RestController
public class AnimeController {

	@Autowired
	public AnimeService aser;
	
	@PostMapping("/post")
	public AnimeModel saveInfo(@RequestBody AnimeModel am)
	{
		return aser.saveInfo(am);
	}
	
	@PutMapping("/put")
	public AnimeModel updateInfo(@RequestBody AnimeModel amo)
	{
		return aser.updateInfo(amo);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteInfo(@PathVariable("id") int id)
	{
		aser.deleteInfo(id);
		return "Deleted";
	}
	
	@DeleteMapping("/dlt")
	public String delete(@RequestParam("id") int id)
	{
		aser.deleteInfo(id);
		return "Deleted";
	}
	
	@GetMapping("/sortdesc/{name}")
	public List<AnimeModel> sortDes(@PathVariable("name") String name)
	{
		return aser.sortDesc(name);
	}
	
	@GetMapping("/pagination/{pnu}/{psize}")
	public List<AnimeModel> paginationData(@PathVariable("pnu") int pnu,@PathVariable("psize") int psize)
	{
		return aser.paginationData(pnu, psize);
	}
	
	@GetMapping("/paginationSorting/{pnu}/{psize}/{name}")
	public List<AnimeModel> paginationSorting(@PathVariable("pnu") int pnu,@PathVariable("psize") int psize,@PathVariable("name") String name)
	{
		return aser.paginationSorting(pnu, psize, name);
	}
	
}
