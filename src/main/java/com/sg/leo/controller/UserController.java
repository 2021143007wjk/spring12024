// ///sbootblog/src/main/java/com/sg/leo/controller/UserController.java

package com.sg.leo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sg.leo.domain.RoleType;
import com.sg.leo.domain.User;
import com.sg.leo.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/oneuser")
	public String insertUser() {
		User uss = new User();
		uss.setId(12);
		uss.setUsername("asdffffff");
		uss.setEmail("sdfsdfsdf");
		userRepository.save(uss);
		return uss.getUsername() + " 회원가입 성공";
	}
	@PostMapping("/user")
	public @ResponseBody String insertUser(@RequestBody User user) {
		user.setRole(RoleType.USER);
		userRepository.save(user);
		return user.getUsername() + "회원가입 성공";
	}
}