package com.salarymanagementsystem;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Salary")
public class Salary {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="S_Id")
	private int s_Id;
	
	@Column(name="Paid_Date")
	private String paid_Date;
	
	@Column(name="Amount_Paid")
	private float amount_Paid;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Slip_no.")
	private String slip_No;
	

	public int getS_Id() {
		return s_Id;
	}


	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}


	public String getPaid_Date() {
		return paid_Date;
	}


	public void setPaid_Date(String paid_Date) {
		this.paid_Date = paid_Date;
	}


	public float getAmount_Paid() {
		return amount_Paid;
	}


	public void setAmount_Paid(float amount_Paid) {
		this.amount_Paid = amount_Paid;
	}


	public String getSlip_No() {
		return slip_No;
	}


	public void setSlip_No(String slip_No) {
		this.slip_No = slip_No;
	}


	
	
	
	
}
