package com.realestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.realestate.dto.CustomerRegistrationDto;
import com.realestate.service.CustomerRegistrationService;

@RestController
@RequestMapping("/customerRegistration")
@CrossOrigin(origins = "*")
public class CustomerRegistrationController {
	@Autowired
	private CustomerRegistrationService customerRegistrationService;
	
	@PostMapping("/create")
	@ResponseStatus(value = HttpStatus.CREATED)
	public CustomerRegistrationDto customerRegistration(@RequestBody CustomerRegistrationDto customerRegistrationDto) {
		
		return customerRegistrationService.addCustomerInfo(customerRegistrationDto);
		
	}

}
