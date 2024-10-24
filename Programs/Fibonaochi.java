package program;

public class Fibonaochi {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println("Finochi series up to" + n + "terms:");
		
		for (int i=1;i<=n;i++) {
			System.out.println(fibnochi(i)+ "");
		}
	}
	public static int fibnochi(int n) {
		if(n<=1) {
			return n;
		}
		return fibnochi(n-1) + fibnochi(n-1);
	}
}
