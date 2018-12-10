package com.custom.service;

import java.util.List;
import java.util.Map;

public interface CustomService {
	
	Map selectCustomById(Map map);
	
	List<Map> searchCustom(Map map);
	
	List<Map> selectCustomList();

	int insertCustom(Map map);
}
