package com.example.__Second_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	@GetMapping("/address")
	public String myAddresss() {
		return "AI BRIDGE BHOPAL";
	}
	
	
	
}
