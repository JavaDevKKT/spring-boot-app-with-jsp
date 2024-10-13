package com.ktech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomePageController {

	@GetMapping("/")
	public ModelAndView welcomePage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "welcome to jsp page .... ");
		mav.setViewName("index");
		return mav;
	}
}
