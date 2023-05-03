package com.example.demo.AnimeController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.AnimeList.Alist;
import com.example.demo.AnimeService.AniService;

@RestController
public class AniControl {
	@Autowired
	public AniService aser;
	@PostMapping("/post")
	public Alist addDetails(@RequestBody Alist al)
	{
		return aser.saveInfo(al);
	}
	@GetMapping("/get/{id}")
	public Optional<Alist> getDetails(@PathVariable("id")int id)
	{
		return aser.getInfo(id);
	}
	@GetMapping("/getmap")
	public List<Alist> getDetails()
	{
		return aser.getData();
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id")int id)
	{
		aser.deleteDetails(id);
		return "Deletion was Successfull";
	}
	@DeleteMapping("/deletemap")
	public String deleteReqByPara(@RequestParam("id")int id)
	{
		aser.deleteDetails(id);
		return id+"deletion was successful";
	}
	@PutMapping("/update")
	public Alist updateInfo(@RequestBody Alist ali)
	{
		return aser.updateDetails(ali);
	}
		@GetMapping("/sortasc/{aname}")
		public List<Alist> sortDetailsAsc(@PathVariable("aname")String aname)
		{
			return aser.sortasc(aname);
		}
		@GetMapping("/sortdesc/{aname}")
		public List<Alist> sortDetailsDesc(@PathVariable("aname")String aname)
		{
			return aser.sortDesc(aname);
		}
		@GetMapping("/paginationD/{pgno}/{pgsi}")
		public List<Alist> paginationData(@PathVariable("pgno")int pgno,@PathVariable("pgsi")int pgsi)
		{
			return aser.paginationD(pgno, pgsi);
		}
		@GetMapping("/paginationS/{pgno}/{pgsi}/{aname}")
		public List<Alist> paginationSort(@PathVariable("pgno")int pgno,@PathVariable("pgsi")int pgsi,@PathVariable("aname")String aname)
		{
			return aser.paginations(pgno, pgsi, aname);
		}
	

}
