package com.board.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

//import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.service.BoardService;


@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/select", method=RequestMethod.GET)
	public @ResponseBody List<Map> selectList(HttpServletRequest request) throws Exception{
		return boardService.selectList();
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public @ResponseBody Map insertBoard(@RequestParam Map<String, Object> param, ModelMap model) throws Exception{
		boardService.insert(param);
		Map custom = boardService.selectById(param);
		System.out.println("customList=="+custom);
		return custom;
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.POST)
	public @ResponseBody List<Map> detail(@RequestParam Map<String, Object> param) throws Exception{
		List<Map> custom = boardService.detail(param);
		return custom;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public @ResponseBody void delete(@RequestParam Map<String, Object> param) throws Exception{
		boardService.delete(param);
	}
}
