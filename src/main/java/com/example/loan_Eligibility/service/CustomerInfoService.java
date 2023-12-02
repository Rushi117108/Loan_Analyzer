package com.example.loan_Eligibility.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.loan_Eligibility.model.Acknowledgement;
import com.example.loan_Eligibility.model.CustomerInfo;

@Service
public interface CustomerInfoService {

	Acknowledgement checkEligibility(CustomerInfo customerInfo);
	
	List<CustomerInfo> getCustomerInfo();
	
}
