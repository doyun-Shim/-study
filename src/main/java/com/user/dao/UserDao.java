package com.user.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDao {
	@Resource
	private SqlSession sqlSession;
	
	public List<Map> selectList(){
		return sqlSession.selectList("User.selectUserList");
	}

	public Map selectOne(Map map){
		return sqlSession.selectOne("User.selectUserById", map);
	}
	
	public int insert(Map map){
		return sqlSession.insert("User.insertUser", map);
	}

	public List<Map> selectList(Map<String, Object> param) {
		return sqlSession.selectList("User.searchUser",param);
	}

	public List<Map> loginChk(Map param) {
		return sqlSession.selectList("User.loginChk",param);
	}

}
