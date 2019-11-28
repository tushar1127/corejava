package java_code_2019;

public class ImprovedArithmatic extends Arithmatic {

	public ImprovedArithmatic() {
		super();
	}

	long sum(long num1, long num2) {
		
		return super.sum(num1, num2);
	}

	long division(long num1, long num2) {
		long result = 0;

		try {

			result = num1 / num2;

			// result = super.division(num1, num2);
			return result;
		} catch (ArithmeticException ae) {
			System.out.println("Error " + ae);
			new ArithmeticException("Divide by zero");
			return 0;
		}


	}

	public static void main(String[] args) {

		Arithmatic arith = new ImprovedArithmatic();
		System.out.print(arith.division(10, 10) +"\n");
		System.out.print(arith.division(200, 20)+"\n");
		System.out.print(arith.division(200, 0));

	}
}
