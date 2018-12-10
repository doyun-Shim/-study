package com.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.user.dao.UserDao;
import com.user.service.UserService;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public int insertUser(Map param){
		return userDao.insert(param);
	}

	@Override
	public Map selectUserById(Map map) {
		return (Map)userDao.selectOne(map);
	}

	public List<Map> selectUserList() {
		return userDao.selectList();
	}

	public List<Map> searchUser(Map param) {
		return userDao.selectList(param);
	}

	public List<Map> loginChk(Map param) {
		return userDao.loginChk(param);
	}

}
