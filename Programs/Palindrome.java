package program;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 121;
		if (isPalindrome(num)) {
			System.out.println(num + "is palindrome");
		}
		else {
			System.out.println(num + "not a palindrome");
		}
	}
	public static boolean isPalindrome(int num) {
		int originalNum=num;
		int reversedNum=0;
		
		while(num !=0) {
			int lastDigit = num % 10;
			reversedNum = reversedNum * 10 + lastDigit;
			num /=10;
		}
		return originalNum == reversedNum;
	}
}
