package com.mercbenz.datalogging.service;

import java.util.Collections;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercbenz.datalogging.dao.impl.DataLoggingDAO;


@Service
public class DataLoggingService {
	
	@Autowired
	DataLoggingDAO dataLoggingDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(DataLoggingService.class);

	
	public Map<String, Object> getFuelCost() {
				return dataLoggingDAO.getFuelCost();
		
	}
}


