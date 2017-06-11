package com.practice.registration.bo.impl;

import org.springframework.stereotype.Service;

import com.practice.registration.bo.RegistrationBo;

@Service
public class RegistrationBoImpl implements RegistrationBo {

	public void registerUser(String firstName, String lastName, String email){
		// Output some info
		System.out.println("RegistrationBoImpl:: Registering user " + firstName + " " + lastName + ", with email " + email);
				
	}
}
