package program;

public class Armstrong {

	public static void main(String[] args) {

		int num = 153;  // You can change this number to test different cases
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int numberOfDigits = String.valueOf(num).length();  // Calculate the number of digits

        // Calculate the sum of digits raised to the power of number of digits
        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            result += Math.pow(digit, numberOfDigits);  // Raise digit to the power of number of digits
            num /= 10;  // Remove the last digit from num
        }

        // Check if the sum is equal to the original number
        return result == originalNum;
    }

			
		}
		
	

