package com.example.loan_Eligibility.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan_Eligibility.model.Acknowledgement;
import com.example.loan_Eligibility.model.CustomerInfo;
import com.example.loan_Eligibility.service.CustomerInfoService;

@RestController
public class CustomerInfoController {

	@Autowired
	CustomerInfoService customerService;
	
	@GetMapping("/getCustomerDetails")
	public List<CustomerInfo> getCustomerInfo(){
		return customerService.getCustomerInfo();
	}
	
	@PostMapping("/checkEligibility")
	public Acknowledgement checkEligibility(@RequestBody CustomerInfo customerInfo) {
		return customerService.checkEligibility(customerInfo);
	}
	
}