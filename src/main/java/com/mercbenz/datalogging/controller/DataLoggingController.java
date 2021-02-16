package com.mercbenz.datalogging.controller;

import java.util.Collections;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mercbenz.datalogging.service.DataLoggingService;

@RestController
public class DataLoggingController {

	@Autowired
	DataLoggingService dataLoggingService;
	
	private static final Logger logger = LoggerFactory.getLogger(DataLoggingController.class);
	@RequestMapping(value = "/getFuelCost", method = RequestMethod.GET)
	public Map<String, Object> getFuelCost() {
			return dataLoggingService.getFuelCost();		
	}
}
