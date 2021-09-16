package com.vaccine.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.vaccine.vo.UserVO;

public class UserDAO {

	private SqlSessionTemplate sessionTemplate;

	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}
	
	public void insertUser(UserVO vo) {
		sessionTemplate.insert("UserDAO.insertUser", vo);
	}
	
	public void updateUser(UserVO vo) {
		sessionTemplate.update("UserDAO.updateUser", vo);
	}
	
	public void deleteUser(UserVO vo) {
		sessionTemplate.delete("UserDAO.deleteUser", vo);
	}
	
	public UserVO getUser(UserVO vo) {
		return sessionTemplate.selectOne("UserDAO.getUser", vo);
	}
}
