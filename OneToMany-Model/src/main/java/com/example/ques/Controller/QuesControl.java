package com.example.ques.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ques.Repository.QuesRepo;
@RestController
@RequestMapping("/question")
public class QuesControl {
		@Autowired
		public QuesRepo qrepo;
		
		@PostMapping("")
		public String saveDetails(@RequestBody QuesRepo q)
		{
			qrepo.save(null);
			return "Saved";
		}
}
