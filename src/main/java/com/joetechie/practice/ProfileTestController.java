package com.joetechie.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile-service")
public class ProfileTestController {
	@Autowired
	ReadProperties readProperties;
	
	@GetMapping("/test")
	public String testprofiles() {
		System.out.println(readProperties.getMyApplicationName());
		System.out.println(readProperties.getServerPort());
		return "tested " + readProperties.getMyApplicationName();
	}
}
