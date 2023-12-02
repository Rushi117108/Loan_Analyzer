package com.example.loan_Eligibility.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="customer")
public class CustomerInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="customer_name")
	public String customerName;
	
	@Column(name="age")
	public int age;
	
	@Column(name="loan_amount")
	public double loanAmount;
	
	@Column(name ="debt_to_income")
	public double debtToIncome;
	
	@Column(name="income")
	public long income;
	
	@Column(name ="cibil_score")
	public int cibilScore;
	
	@Column(name="employemnt_mode")
	public String employmentMode;

	public CustomerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerInfo(int id, String customerName, int age, double loanAmount, double debtToIncome, long income,
			int cibilScore, String employmentMode) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.age = age;
		this.loanAmount = loanAmount;
		this.debtToIncome = debtToIncome;
		this.income = income;
		this.cibilScore = cibilScore;
		this.employmentMode = employmentMode;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getDebtToIncome() {
		return debtToIncome;
	}

	public void setDebtToIncome(double debtToIncome) {
		this.debtToIncome = debtToIncome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	public String getEmploymentMode() {
		return employmentMode;
	}

	public void setEmploymentMode(String employmentMode) {
		this.employmentMode = employmentMode;
	}
	
}
