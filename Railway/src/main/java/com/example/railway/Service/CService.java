package com.example.railway.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.railway.RailwayData.CustomerInfo;
import com.example.railway.Repository.CRepo;
@Service
public class CService {
@Autowired
CRepo crep;
	public CustomerInfo saveDetails(CustomerInfo sd) 
	{
		return crep.save(sd);
	}
}
