package com.shop.GH.service;

import java.util.List;

import com.shop.GH.vo.MemberVO;

/**
 * @author 김건수
 * @회원가입
 */
public interface MemberService {

	
	//회원가입
	public int register(MemberVO vo);
	
	//조회 어드민
	public List<MemberVO> selectAll();
	
	//삭제 어드민
	public int MemberDelete(String id);
}
