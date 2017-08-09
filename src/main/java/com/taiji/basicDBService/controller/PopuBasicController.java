package com.taiji.basicDBService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PopuBasicController {
	Logger log = LoggerFactory.getLogger(PopuBasicController.class);
	
	@RequestMapping("/")
	@ResponseBody
	public String getStart(){
		log.debug("finished");
		return "finish";
	}
}
