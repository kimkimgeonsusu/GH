package com.shop.GH;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author 김건수
 * @관리자 컨트롤러
 *
 */
@Controller
public class AdminController {
		
	@RequestMapping(value = "/adminsale", method = RequestMethod.GET)
	public ModelAndView home() {							
		return new ModelAndView("admin/sale");
	}
	
}
