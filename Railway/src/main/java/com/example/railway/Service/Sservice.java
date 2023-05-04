package com.example.railway.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.railway.RailwayData.StationInfo;
import com.example.railway.Repository.SRepo;
@Service
public class Sservice 
{
	@Autowired
	SRepo srep;
	public StationInfo saveData(StationInfo sh) 
	{
		return srep.save(sh);
	}
}
