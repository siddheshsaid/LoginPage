package com.qsp.model;

public class Person {
	
	private String userName;
	private String userPassword;
	private String userEmail;
	private String userContact;
	
	
	
	public Person() {
		super();
	}
	
	
	public Person(String userName, String userPassword, String userEmail,String userContact) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userContact = userContact;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getUserContact() {
		return userContact;
	}
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	@Override
	public String toString() {
		return "Person [userName=" + userName + ", userPassword=" + userPassword + ", userEmail=" + userEmail
				+ ", userContact=" + userContact + "]";
	}
	
	
	
	

}
