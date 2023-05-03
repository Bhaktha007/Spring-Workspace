package com.example.demo.AniService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.AniRepository.AniRepo;
import com.example.demo.AnimeList.Alist;
@Service
public class Aservice {
		@Autowired
		public AniRepo lrepo;
		public Alist saveInfo(Alist lb)
		{
			return lrepo.save(lb);
		}
		public Optional<Alist> getInfo(int id) 
		{
			return lrepo.findById(id);
		}
		public List<Alist> getData(Alist al)
		{
			return lrepo.findAll();
		}
		public Alist updateDetails(Alist ld) 
		{
			return lrepo.saveAndFlush(ld);
		}
		public void deletedetails(int id) 
		{
			lrepo.deleteById(id);
		}
		public List<Alist> sortDesc(String lname)
		{
			return lrepo.findAll(Sort.by(lname).descending());
		}
		public List<Alist> sortAsc(String lname)
		{
			return lrepo.findAll(Sort.by(lname).ascending());
		}
		public List<Alist> paginationD(int pgno,int pgsize)
		{
			Page<Alist> p = lrepo.findAll(PageRequest.of(pgno, pgsize));
			return p.getContent();
		}
		public List<Alist> paginationS(int pgno,int pgsize,String lname)
		{
			Page<Alist> ps = lrepo.findAll(PageRequest.of(pgno, pgsize, Sort.by(lname).descending()));
			return ps.getContent();
			
		}
		public String loginCheckData(String username,String password)
		{
			Alist user = lrepo.findByusername(username);
			if(user == null)
			{
				return "No User Found Please Try Again!!!!";
			}
			else
			{
				if(user.getPassword().equals(password))
				{
					return "Login Successful";
				}
				else
				{
					return "Login Failed";
				}
			}
		}
		public Alist addUser(Alist ld)
		{
			return lrepo.save(ld);
		}
		public List<Alist> getData()
		{
			return lrepo.findAll();
		}

}
