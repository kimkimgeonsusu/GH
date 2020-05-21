package com.shop.GH.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.GH.dao.MemberDAO;
import com.shop.GH.vo.MemberVO;


/**
 * @author 김건수
 * @회원가입
 */
@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDAO dao;

	//회원가입
	@Override
	public int register(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.register(vo);
	}
	
	

}
