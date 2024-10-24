package program;

public class Factorial {

	public static void main(String[] args) {
		
		int num = 9;
		long factorial = calculateFactorial(num);
		System.out.println("Factorial of " +num + "is" +factorial);
	}
	public static long calculateFactorial(int num) {
		long result = 1;
		{
			for (int i=1;i<=num;i++) {
				result *=i;
			}
			return result;
		}
		
		
	}
}
