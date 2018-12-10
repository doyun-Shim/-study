package com.user.service;

import java.util.List;
import java.util.Map;

public interface UserService {
	
	Map selectUserById(Map map);
	
	List<Map> searchUser(Map map);
	
	List<Map> selectUserList();

	int insertUser(Map map);
	
	List<Map> loginChk(Map map);
	
}
