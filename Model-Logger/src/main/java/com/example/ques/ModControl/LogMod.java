package com.example.ques.ModControl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogMod 
{
	Logger log = LoggerFactory.getLogger(LogMod.class);
	@RequestMapping("/")
	public String model()
	{
		log.info("information data");
		log.warn("warning data");
		log.debug("debug message");
		log.error("error message");
		log.trace(" trace message");
		return "completed";
	}
}
