package com.sg.leo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sg.leo.domain.User;



@org.springframework.web.bind.annotation.RestController
public class RestController {
	@GetMapping("/jblog")
	public User httpGet() {
		User finduser = User.builder().id(1).username("ai").password("222").email("asd").build();
		return finduser;
	}
	
	@PostMapping("jblog")
	public String httpPost(@RequestBody User user) {
		return "post 처리" + user.toString();
	}
	
	@PutMapping("jblog")
	public String httpPut() {
		return "put 처리";
	}
	
	@DeleteMapping("jblog")
	public String httpDelete() {
		return "Delete 처리";
	}
}
