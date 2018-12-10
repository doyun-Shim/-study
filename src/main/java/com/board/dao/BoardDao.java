package com.board.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("BoardDao")
public class BoardDao {
	@Resource
	private SqlSession sqlSession;
	
	public List<Map> selectList(){
		return sqlSession.selectList("Board.selectList");
	}

	public Map selectOne(Map map){
		return sqlSession.selectOne("Board.selectById", map);
	}
	
	public int insert(Map map){
		return sqlSession.insert("Board.insert", map);
	}

	public List<Map> selectList(Map<String, Object> param) {
		return sqlSession.selectList("Board.search",param);
	}

	public List<Map> detail(Map<String, Object> param) {
		return sqlSession.selectList("Board.detail",param);
	}

	public int update(Map param) {
		return sqlSession.update("Board.update", param);
	}

	public void delete(Map param) {
		sqlSession.delete("Board.delete", param);
	}
}
