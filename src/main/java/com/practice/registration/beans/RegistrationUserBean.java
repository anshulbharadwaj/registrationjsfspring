package com.practice.registration.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.registration.bo.RegistrationBo;

@Component
@ManagedBean
@SessionScoped
public class RegistrationUserBean {

	private String firstName;
	private String lastName;
	private String email;

	@Autowired
	RegistrationBo registrationBo;

	public void register(){
		System.out.println("RegistrationUserBean:: Registering user " + firstName + " " + lastName + ", with email " + email);

		// Call the business object to register the user
		registrationBo.registerUser(firstName, lastName, email);
		
		// Set the message here
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Registration success", "success");  
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	// Set the registrationBo attribute used by Spring
	public void setRegistrationBo(RegistrationBo registrationBo) {
		this.registrationBo = registrationBo;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
