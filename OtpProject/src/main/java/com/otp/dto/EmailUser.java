package com.otp.dto;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class EmailUser {
	@Id
	private int userID;
	private String userOrderId;
	private String userEmail;
	public EmailUser(int userID, String userOrderId, String userEmail) {
		super();
		this.userID = userID;
		this.userOrderId = userOrderId;
		this.userEmail = userEmail;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserOrderId() {
		return userOrderId;
	}
	public void setUserOrderId(String userOrderId) {
		this.userOrderId = userOrderId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "EmailUser [userID=" + userID + ", userOrderId=" + userOrderId + ", userEmail=" + userEmail + "]";
	}
	
	
}
