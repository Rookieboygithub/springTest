package com.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/basic")
public class BasicController {

	@GetMapping(value = "/")
	@ResponseBody
	public ModelAndView index() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
}
