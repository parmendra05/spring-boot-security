package com.param.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupportController {

	@GetMapping("/mySupport")
	public String getSupport() {
		return "support@gm.com, +91 180020000";
	}
	
}
