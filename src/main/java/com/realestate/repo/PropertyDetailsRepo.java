package com.realestate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.realestate.entity.PropertyDetailsEntity;

public interface PropertyDetailsRepo extends JpaRepository<PropertyDetailsEntity, Long> {

}
