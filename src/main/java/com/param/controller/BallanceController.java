package com.param.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BallanceController {

	@GetMapping("/myBallance")
	public String getBallance() {
		return "Account Ballance- 500000";
	}
	
}
