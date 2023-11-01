package com.realestate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyDetailsDto {
	
	private Long id;

	private String category;

	private Long unitNumber;

	private String carpetArea;

	private String facing;

	private String type;

	private Long noOfCarParking;

	private String unitPrice;

	private String carParking;
}
