package output;

import java.util.Scanner;

public class outputfuntion {
	public static void main(String[] args) {
//		int a = 6;
//		int b = 9;
//		int c = Math.max(6, 9);
//		System.out.println("Max = " + c);
		Scanner scanner = new Scanner(System.in);
		System.out.println("first number: ");
		int firstnumber = scanner.nextInt();
		System.out.println("second number: ");
		int secondnumber = scanner.nextInt();
		System.out.println("Min = " + Math.min(firstnumber, secondnumber));
		scanner.close();
	}
}
