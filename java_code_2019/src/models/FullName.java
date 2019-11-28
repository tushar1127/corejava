package models;
public class FullName {
	
	String firstName;
	String lastName;
	String MiddleName;

	public FullName() {
		this.firstName = null;
		this.lastName =  null;
		this.MiddleName= null;
	}
	
	public FullName( String firstName, String lastName, String MiddleName ) {
		this.firstName = firstName;
		this.lastName =  lastName;
		this.MiddleName = MiddleName;	
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}