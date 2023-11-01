package com.realestate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRegistrationDto {

	private Long id;

	private String applicantName;

	private String panDetails;

	private String aadharDetails;

	private String email;

	private String mobileNumber;

	private String password;
}
