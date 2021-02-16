package com.mercbenz.datalogging.dao.impl;

import java.util.HashMap;
import java.util.Map;

public class DataLoggingImpl implements DataLoggingDAO{
	
	@Override
	public Map<String, Object> getFuelCost() {
		Map<String,Object> fuelCost = new HashMap<String,Object>();
		
		fuelCost.put("Bengaluru", 83.5);
		fuelCost.put("Pune", 94);
		fuelCost.put("Haryana", 83.4);
		fuelCost.put("Alwar", 93.7);
		
		return fuelCost;
	}

}
