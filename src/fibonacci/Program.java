package fibonacci;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the quantity of numbers: ");
		int number = sc.nextInt();
		
		methodLinear(number);
		
		sc.close();
	}
	
	static void methodLinear(int quantity) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		System.out.print(n1 + " " + n2);
		
		for (int i = 2; i <= quantity; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}