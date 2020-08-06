package com.anhthao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String formActionGET() {
		return "student/form";
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String formActionPOST(
			@RequestParam(name = "name") String name,
			@RequestParam(name = "mark") String mark,
			@RequestParam(name = "major")String major,
			Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("mark", mark);
		model.addAttribute("major", major);
		
		return "student/success";
	}
}
