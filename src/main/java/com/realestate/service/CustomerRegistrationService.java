package com.realestate.service;

import com.realestate.dto.CustomerRegistrationDto;
import com.realestate.dto.LoginDto;

public interface CustomerRegistrationService {

	CustomerRegistrationDto addCustomerInfo(CustomerRegistrationDto customerRegistrationDto);
	
	String validateCustomer(LoginDto loginDto);
}
