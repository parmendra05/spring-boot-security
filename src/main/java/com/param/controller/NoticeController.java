package com.param.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {

	@GetMapping("/myNotice")
	public String getNotice() {
		return "50% off on loan processing fees";
	}

}
