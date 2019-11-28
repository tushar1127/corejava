package models;

public class Address {
	String addressLine1;
	String addressLine2;
	String landmark;
	String city;
	String State;
	String country;
	String pin;

	public Address() {
		this.addressLine1 = null;
		this.addressLine2 = null;
		// this.Address()
	}

	public Address(String addressLine1, String addressLine2) {
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
	}
	
	

}
