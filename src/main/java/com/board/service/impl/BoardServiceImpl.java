package com.board.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.dao.BoardDao;
import com.board.service.BoardService;


@Service
@Transactional(rollbackFor = Exception.class)
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao dao;
	
	@Override
	public int insert(Map param){
//		Map map = dao.selectOne(param);
//		if(map !=null){
//			return dao.update(param);
//		}else{
			return dao.insert(param);
//		}
	}

	@Override
	public Map selectById(Map map) {
		return dao.selectOne(map);
	}

	public List<Map> selectList() {
		return dao.selectList();
	}

	public List<Map> detail(Map param) {
		return dao.detail(param);
	}

	@Override
	public void delete(Map param) {
		dao.delete(param);

	}

}
