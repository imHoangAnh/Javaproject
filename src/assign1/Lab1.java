package assign1;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name: ");
		String name = scanner.nextLine();
		System.out.println("Your point: ");
		int point = scanner.nextInt();
		System.out.println(name + " co diem = " + point);
	}

}
