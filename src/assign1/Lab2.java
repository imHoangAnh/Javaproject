package assign1;

import java.util.Scanner;

public class Lab2 extends Lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Length: ");
		int lenght = scanner.nextInt();
		System.out.println("Width: ");
		int width = scanner.nextInt();
		System.out.println("Chu vi = " + Math.multiplyExact(Math.addExact(lenght, width), 2));
		System.out.println("Dien tich = " + Math.multiplyExact(lenght, width));
		System.out.println("Canh nho nhat = " + Math.min(lenght, width));
	}
}
