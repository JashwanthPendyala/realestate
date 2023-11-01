package com.realestate.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realestate.dto.CustomerRegistrationDto;
import com.realestate.dto.LoginDto;
import com.realestate.entity.CustomerRegistrationEntity;
import com.realestate.exception.InvalidEmail;
import com.realestate.exception.InvalidUser;
import com.realestate.repo.CustomerRegistrationRepo;
import com.realestate.service.CustomerRegistrationService;

@Service
public class CustomerRegistrationServiceImpl implements CustomerRegistrationService {

	@Autowired
	private CustomerRegistrationRepo customerRegistrationRepo;

	@Autowired
	private ModelMapper mapper;

	@Override
	public CustomerRegistrationDto addCustomerInfo(CustomerRegistrationDto customerRegistrationDto) {
		CustomerRegistrationEntity customerRegistrationEntity = new CustomerRegistrationEntity();
		customerRegistrationEntity.setApplicantName(customerRegistrationDto.getApplicantName());
		customerRegistrationEntity.setAadharDetails(customerRegistrationDto.getAadharDetails());
		customerRegistrationEntity.setEmail(customerRegistrationDto.getEmail());
		customerRegistrationEntity.setMobileNumber(customerRegistrationDto.getMobileNumber());
		customerRegistrationEntity.setPanDetails(customerRegistrationDto.getPanDetails());
		customerRegistrationEntity.setPassword(customerRegistrationDto.getPassword());
		customerRegistrationRepo.save(customerRegistrationEntity);
		return mapper.map(customerRegistrationEntity, CustomerRegistrationDto.class);
	}

	@Override
	public String validateCustomer(LoginDto loginDto) {
	    CustomerRegistrationEntity findByEmail = customerRegistrationRepo.findByEmail(loginDto.getEmail())
	            .orElseThrow(() ->
	            new InvalidEmail("Email Doesn't Exist..!"));
	    if(findByEmail.getPassword().equals(loginDto.getPassword())) {
	        return "Valid User";
	    } else {
	        throw new InvalidUser("Invalid User");
	    }
	}

}
