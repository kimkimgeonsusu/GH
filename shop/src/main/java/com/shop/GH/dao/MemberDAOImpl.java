package com.shop.GH.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.shop.GH.vo.MemberVO;


/**
 * @author 김건수
 * @회원가입
 */

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSessionTemplate sql;

	//회원가입
	@Override
	public int register(MemberVO vo) {
		// TODO Auto-generated method stub
		return sql.insert("member.register",vo);
	}
	
	


}
