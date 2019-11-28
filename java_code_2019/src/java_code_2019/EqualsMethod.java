package java_code_2019;
import models.FullName;

public class EqualsMethod {
	
	public EqualsMethod() {}
	
	public static void main(String[] args) {

		FullName user1 = new FullName("Tushar","tushar.khairnar1127@gmail.com","9665984771");
		FullName user2 = new FullName("Tushar","tushar.khairnar1127@gmail.com","9665984771");

		System.out.println( user1.equals(user1) ); 	// true
		System.out.println( user1.equals(user2) ); 	// false
		System.out.println( user1 == user2 ); 	 	// false
	
	}
}