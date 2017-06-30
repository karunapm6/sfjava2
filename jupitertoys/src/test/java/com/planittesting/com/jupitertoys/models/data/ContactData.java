package com.planittesting.com.jupitertoys.models.data;

public class ContactData {
	
	private String forename = null;
	private String surname = null;
	private String telephone = null;
	private String email = null;
	private String message = null;
	
	public ContactData(){
		
	}
	
	public ContactData withForename(String forename) {
		this.setForename(forename);
		return this;
	}
	public ContactData withSurname(String surname) {
		this.setSurname(forename);
		return this;
	}
	public ContactData withTelephone(String telephone) {
		this.setTelephone(telephone);
		return this;
	}
	public ContactData withEmail(String email) {
		this.setEmail(email);
		return this;
	}
	public ContactData withMessage(String message) {
		this.setMessage(message);
		return this;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
