package com.board.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
	
	Map selectById(Map map);
	
	List<Map> detail(Map map);
	
	List<Map> selectList();

	int insert(Map map);

	void delete(Map param);
}
