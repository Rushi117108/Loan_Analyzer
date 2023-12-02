package com.example.loan_Eligibility.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="acknowledgement")
public class Acknowledgement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="is_eligible")
	public boolean isEligible;
	
	@Column(name="approved_amount")
	public double approvedAmount;
	
	@Column(name="criteria_mismatch")
	public List<String> criteriaMismatch;
	
		
	public boolean isEligible() {
		return isEligible;
	}

	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}

	public double getApprovedAmount() {
		return approvedAmount;
	}

	public void setApprovedAmount(double approvedAmount) {
		this.approvedAmount = approvedAmount;
	}

	public List<String> getCriteriaMismatch() {
		return criteriaMismatch;
	}

	public void setCriteriaMismatch(List<String> criteriaMismatch) {
		this.criteriaMismatch = criteriaMismatch;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Acknowledgement(int id, boolean isEligible, double approvedAmount, List<String> criteriaMismatch) {
		super();
		this.id = id;
		this.isEligible = isEligible;
		this.approvedAmount = approvedAmount;
		this.criteriaMismatch = criteriaMismatch;
	}

	public Acknowledgement() {
		// TODO Auto-generated constructor stub
	}

}
