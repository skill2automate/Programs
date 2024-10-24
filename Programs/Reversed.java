package program;

public class Reversed {

	public static void main(String[] args) {

		String originalString="vtyasad";
		String reversedString= reverse(originalString);
		System.out.println("Original string is:"+ originalString);
	    System.out.println("Reversed string is:" +reversedString);
	}
	public static String reverse(String str) {
		String reversed="";
		for(int i=str.length()-1;i>=0;i--) {
		reversed += str.charAt(i);
	}
	
	return reversed;
		
		
		
		
	}
}

