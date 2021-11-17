package com.otp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity

public class Email {
	@Id
	private int userId;
	private String orderId;
	private int otp;
	private String email;
	
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Email(int userId, String orderId, String email) {
		super();
		this.userId = userId;
		this.orderId = orderId;
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Email [userId=" + userId + ", orderId=" + orderId + ", otp=" + otp + ", email=" + email + "]";
	}
	
}
