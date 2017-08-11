package com.taiji.basicDBService.controller;

import org.apache.logging.log4j.EventLogger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.message.StructuredDataMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PopuBasicController {
	Logger log = LoggerFactory.getLogger(PopuBasicController.class);
	private org.apache.logging.log4j.Logger logger = LogManager.getLogger(PopuBasicController.class);
	
	@RequestMapping("/")
	@ResponseBody
	public String getStart(){
		logger.debug("in menthod");
		EventLogger.logEvent(new StructuredDataMessage("121", null, "type"));
		logger.exit();
		return "finish";
	}
}
