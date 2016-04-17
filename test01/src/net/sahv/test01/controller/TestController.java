package net.sahv.test01.controller;

import javax.servlet.http.HttpServletRequest;

import net.sahv.test01.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("index2")
	public String index(HttpServletRequest request,Model model){
		model.addAttribute("msg","asdfasdfasdfasdf");
		return "index";
	}
	
	@RequestMapping
	public String hello(HttpServletRequest request,Model model){
		model.addAttribute("msg",testService.getMsg("ÕÅÈý"));
		return "hello";
	}
}
