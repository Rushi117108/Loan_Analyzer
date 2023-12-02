package com.example.loan_Eligibility.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan_Eligibility.model.CustomerInfo;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Integer> {

//	List<CustomerInfo> findAll();
}
