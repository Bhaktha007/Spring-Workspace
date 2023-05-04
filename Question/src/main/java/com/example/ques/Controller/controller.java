package com.example.ques.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques.Repository.Questionrepo;
@RestController
@RequestMapping("/question")

public class controller {
	

		@Autowired
		public Questionrepo qrepo;
		
		@PostMapping("")
		public String saveDetails(@RequestBody Questionrepo q)
		{
			qrepo.save(null);
			return "Saved";
		}
}
