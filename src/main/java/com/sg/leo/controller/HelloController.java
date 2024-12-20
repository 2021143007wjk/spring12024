package com.sg.leo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {
	
	@GetMapping("/img")
	public String img() {
		System.out.println("이미지파일 요청");
		return "redirect:/image/peacock.jpg";
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("jsp 요청됨");
		model.addAttribute("username", "주인 우정광.");
		return "hellojsp";
	}
}
