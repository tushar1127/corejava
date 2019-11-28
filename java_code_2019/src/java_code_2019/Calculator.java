package java_code_2019;

public class Calculator {

	public long sum(int arguments[]) {
		long total = 0;
		// Advance for loop
		for (int arg : arguments) {
			total += arg;
		}
		return total;
	}

	public long multi(int arguments[]) {
		long total = 1;

		for (int i = 0; i < arguments.length; i++) {
			total *= arguments[i];
		}

		return total;
	}

	public long division(int ...arg) {
		int count = 0;
		int _division = 0;

		do {
			_division  = arg[count] / arg[count + 1];

			count++;
		} while (arg.length < count);
		return _division; 
				
	}

	public static void main(String[] args) {

		Calculator calculate = new Calculator();
		int[] nums = { 10, 20, 30 };
		int[] nums2 = { 10000, 10, 100 };

		System.out.println("sum :" + calculate.sum(nums));
		System.out.println("multiplication :" + calculate.multi(nums));
		System.out.println("Division :" + calculate.division(nums2));
	}

}