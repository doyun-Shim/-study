package com.user.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.user.service.impl.UserServiceImpl;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping(value="/select", method=RequestMethod.GET)
	public @ResponseBody List<Map> selectList() throws Exception{
		return userService.selectUserList();
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public @ResponseBody Map insertUser(@RequestParam Map<String, Object> param, ModelMap model) throws Exception{
		userService.insertUser(param);
		Map custom = userService.selectUserById(param);
		System.out.println("customList=="+custom);
		return custom;
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public @ResponseBody List<Map> search(@RequestParam Map<String, Object> param) throws Exception{
		List<Map> custom = userService.searchUser(param);
		return custom;
	}
	
	@RequestMapping(value="/loginChk", method=RequestMethod.POST)
	public @ResponseBody List<Map> loginChk(@RequestParam Map<String, Object> param, HttpServletRequest request) throws Exception{
		List<Map> custom = userService.loginChk(param);
		if(custom.size() >1){
			throw new Exception("등록된 사용자가 2명 이상입니다.");
		}
		return custom;
	}
}
