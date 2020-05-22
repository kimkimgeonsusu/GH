package com.shop.GH;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shop.GH.service.MemberService;
import com.shop.GH.vo.MemberVO;


/**
 * @author 김건수
 * @관리자 컨트롤러
 *
 */
@Controller
public class AdminController {
	
	@Inject
	private MemberService m_service;
	
	@RequestMapping(value = "admin/home", method = RequestMethod.GET)
	public ModelAndView homess() {							
		return new ModelAndView("admin/home");
	}
	
	@RequestMapping(value = "/admin/selectAll", method = RequestMethod.GET)
	public ModelAndView selectAll() {							
		List<MemberVO> list = m_service.selectAll();				
		return new ModelAndView("admin/list","list",list);
	}
	@ResponseBody
	@RequestMapping(value = "/admin/delMember", method = RequestMethod.GET)
	public String deleteMember(HttpServletRequest request) {
		//System.out.println(id);
		//int result = m_service.MemberDelete(id);
		int result = 1;
		System.out.println(result);
		return "ihi";
	}
	
	@ResponseBody
	@RequestMapping(value = "/admin/check", method = RequestMethod.GET)
	public String checkk() {							
		return "hihi";
	}
	
	
	
	
}
