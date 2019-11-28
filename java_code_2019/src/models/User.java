package models;

import java.util.UUID;

public class User {
	
	//UUID _id; 
	String fullName;
	String email;
	String contact;
	
	public User() {
		this.fullName = null;
		this.email = null;
		this.contact = null;
	}

	public User(
			String fullName, 
			String email,
			String contact) {
	
		this.fullName = fullName;
		this.email = email;
		this.contact = contact;
	}
	
}