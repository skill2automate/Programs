package program;

public class Prime_No {

	public static void main(String[] args) {
		
		int num = 29;
		if (isPrime(num)) {
			System.out.println(num + "is prime no");
		}
		else {
			System.out.println(num + "is not prime no");
		}
	}
	public static boolean isPrime(int num) {
		if(num <=1) {
			return false;
		}
		for (int i = 2;i<=Math.sqrt(num);i++) {
			if(num % i == 0) {
				return false;
		
			}
			
		
		}
		return true;
		
		
		
	}
}

