package com.custom.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("CustomDao")
public class CustomDao {
	@Resource
	private SqlSession sqlSession;
	
	public List<Map> selectList(){
		return sqlSession.selectList("Custom.selectCustomList");
	}

	public Map selectOne(Map map){
		return sqlSession.selectOne("Custom.selectCustomById", map);
	}
	
	public int insert(Map map){
		return sqlSession.insert("Custom.insertCustom", map);
	}

	public List<Map> selectList(Map<String, Object> param) {
		return sqlSession.selectList("Custom.searchCustom",param);
	}
}
