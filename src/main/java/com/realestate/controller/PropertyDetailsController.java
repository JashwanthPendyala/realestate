package com.realestate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.realestate.dto.PropertyDetailsDto;
import com.realestate.service.PropertyDetailsService;

@RestController
@RequestMapping("/property")
@CrossOrigin(origins = "*")
public class PropertyDetailsController {
	
	@Autowired
	private PropertyDetailsService detailsService;
	
	@GetMapping("/getAllPropertyDetails")
	@ResponseStatus(value = HttpStatus.OK)
	public List<PropertyDetailsDto> getAllPropertyDetails() {
		return detailsService.getAllProperties();
		
	}
	
	@GetMapping("/getPropertyDetailsById")
	@ResponseStatus(value = HttpStatus.OK)	
	public PropertyDetailsDto getPropertyDetailsById(@RequestParam Long id) {
		return detailsService.getPropertyById(id);
		
	}

}
