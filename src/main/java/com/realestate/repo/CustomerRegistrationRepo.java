package com.realestate.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.realestate.entity.CustomerRegistrationEntity;

public interface CustomerRegistrationRepo  extends JpaRepository<CustomerRegistrationEntity, Long>{

	Optional<CustomerRegistrationEntity> findByEmail(String email);
}
