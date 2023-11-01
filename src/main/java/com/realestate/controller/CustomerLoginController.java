package com.realestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.realestate.dto.LoginDto;
import com.realestate.exception.InvalidEmail;
import com.realestate.exception.InvalidUser;
import com.realestate.service.CustomerRegistrationService;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "*")
public class CustomerLoginController {

	@Autowired
	private CustomerRegistrationService customerRegistrationService;

	@ResponseStatus(value = HttpStatus.OK)
	@PostMapping("/validateCustomer")
	public ResponseEntity<String> validateCustomer(@RequestBody LoginDto loginDto) {
		try {
			String validationStatus = customerRegistrationService.validateCustomer(loginDto);
			return ResponseEntity.ok(validationStatus);
		} catch (InvalidEmail | InvalidUser e) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
		}
	}
}
