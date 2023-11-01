package com.realestate.service;

import java.util.List;

import com.realestate.dto.PropertyDetailsDto;

public interface PropertyDetailsService {

	PropertyDetailsDto addPropertyDetails(PropertyDetailsDto detailsDto);
	List<PropertyDetailsDto> getAllProperties();
	PropertyDetailsDto getPropertyById(Long id);

}
