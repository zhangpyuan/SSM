package com.lin.domain;

/**
 * User鏄犲皠绫�
 * 
 * @author linbingwen
 * @time 2015.5.15
 */
public class User {
	private Integer userId;
	private String username;
	private String userPassword;
	private String userEmail;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username
				+ ", userPassword=" + userPassword + ", userEmail=" + userEmail
				+ "]";
	}

	
	
}
