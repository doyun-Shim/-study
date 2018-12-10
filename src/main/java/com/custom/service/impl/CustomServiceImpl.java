package com.custom.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.custom.dao.CustomDao;
import com.custom.service.CustomService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomServiceImpl implements CustomService{
	
	@Autowired
	private CustomDao customDao;
	
	@Override
	public int insertCustom(Map param){
		return customDao.insert(param);
	}

	@Override
	public Map selectCustomById(Map map) {
		return (Map)customDao.selectOne(map);
	}

	public List<Map> selectCustomList() {
		return customDao.selectList();
	}

	public List<Map> searchCustom(Map param) {
		return customDao.selectList(param);
	}
}
