package com.example.loan_Eligibility.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.loan_Eligibility.model.Acknowledgement;
import com.example.loan_Eligibility.model.CustomerInfo;
import com.example.loan_Eligibility.repository.CustomerInfoRepository;

@Service
@Transactional
public class CustomerInfoSeviceImpl implements CustomerInfoService{

	@Autowired
	CustomerInfoRepository custRepo;
	
	public Acknowledgement checkEligibility(CustomerInfo customerInfo) {
		
		custRepo.save(customerInfo);
		
		Acknowledgement ack = new Acknowledgement();
		List<String> mismatchList = new ArrayList<>();

		
		if(customerInfo.getAge()<25 && customerInfo.getAge() >60) {
			mismatchList.add("Person age should be in between 30 to 60");
		}
		
		if(customerInfo.getIncome()<250000) {
			mismatchList.add("Person income should be more than 250000");
		}
		
		if(customerInfo.getCibilScore() < 500) {
			mismatchList.add("You are having low CIBIL score. Please try after 6 months");
		}
		
		if(customerInfo.getDebtToIncome() >0.5) {
			mismatchList.add("You are having high Debt to Income(DTI). Please try after 6 months");
		}
		
		if(mismatchList.size()>0) {
			ack.setApprovedAmount(0);
			ack.setEligible(false);
		}else{
			ack.setApprovedAmount(customerInfo.getLoanAmount());
			ack.setEligible(true);
			mismatchList.clear();	
		}
		ack.setCriteriaMismatch(mismatchList);
		
		return ack;
		
	}
	
	public List<CustomerInfo> getCustomerInfo() {
		List<CustomerInfo> custList = custRepo.findAll();
		
		return custList;
	}
}
