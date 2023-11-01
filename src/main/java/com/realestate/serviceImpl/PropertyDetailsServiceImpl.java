package com.realestate.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realestate.dto.PropertyDetailsDto;
import com.realestate.entity.PropertyDetailsEntity;
import com.realestate.repo.PropertyDetailsRepo;
import com.realestate.service.PropertyDetailsService;
@Service
public class PropertyDetailsServiceImpl implements PropertyDetailsService {
	
	@Autowired
	private  PropertyDetailsRepo detailsRepo;

	@Override
	public PropertyDetailsDto addPropertyDetails(PropertyDetailsDto detailsDto) {
		PropertyDetailsEntity detailsEntity = new PropertyDetailsEntity();
		
		return null;
	}

	@Override
	public List<PropertyDetailsDto> getAllProperties() {
		List<PropertyDetailsEntity> pList = detailsRepo.findAll();
		return pList.stream().map(obj->{
			PropertyDetailsDto detailsDto = new PropertyDetailsDto();
			detailsDto.setId(obj.getId());
			detailsDto.setCarParking(obj.getCarParking());
			detailsDto.setCarpetArea(obj.getCarpetArea());
			detailsDto.setCategory(obj.getCategory());
			detailsDto.setFacing(obj.getFacing());
			detailsDto.setNoOfCarParking(obj.getNoOfCarParking());
			detailsDto.setType(obj.getType());
			detailsDto.setUnitNumber(obj.getUnitNumber());
			detailsDto.setUnitPrice(obj.getUnitPrice());
			return detailsDto;
		}).toList() ;
	}

	@Override
	public PropertyDetailsDto getPropertyById(Long id) {
		 PropertyDetailsEntity obj = detailsRepo.findById(id).get();
		 PropertyDetailsDto detailsDto = new PropertyDetailsDto();
			detailsDto.setId(obj.getId());
			detailsDto.setCarParking(obj.getCarParking());
			detailsDto.setCarpetArea(obj.getCarpetArea());
			detailsDto.setCategory(obj.getCategory());
			detailsDto.setFacing(obj.getFacing());
			detailsDto.setNoOfCarParking(obj.getNoOfCarParking());
			detailsDto.setType(obj.getType());
			detailsDto.setUnitNumber(obj.getUnitNumber());
			detailsDto.setUnitPrice(obj.getUnitPrice());
		return detailsDto;
	}

}
