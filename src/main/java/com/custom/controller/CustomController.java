package com.custom.controller;

import java.util.List;
import java.util.Map;

//import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.custom.service.impl.CustomServiceImpl;


@Controller
@RequestMapping("/custom")
public class CustomController {
	@Autowired
	private CustomServiceImpl customService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String select() throws Exception{
		return "custom";
	}
	
	@RequestMapping(value="/select", method=RequestMethod.GET)
	public @ResponseBody List<Map> selectList() throws Exception{
		return customService.selectCustomList();
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public @ResponseBody Map insertCustom(@RequestParam Map<String, Object> param, ModelMap model) throws Exception{
		customService.insertCustom(param);
		Map custom = customService.selectCustomById(param);
		System.out.println("customList=="+custom);
		return custom;
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public @ResponseBody List<Map> search(@RequestParam Map<String, Object> param) throws Exception{
		List<Map> custom = customService.searchCustom(param);
		return custom;
	}
}
