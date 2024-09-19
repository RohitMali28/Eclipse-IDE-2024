package Java1;

import java.util.Scanner;

public class java4Calculator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int choice = scanner.nextInt();
		double num1, num2, result;
		switch (choice) {
		case 1:
			System.out.println("Enter first number:");
			num1 = scanner.nextDouble();
			System.out.println("Enter second number:");
			num2 = scanner.nextDouble();
			result = num1 + num2;
			System.out.println("Ans" + result);
		case 2:
			System.out.println("Enter first number:");
			num1 = scanner.nextDouble();
			System.out.println("Enter second number:");
			num2 = scanner.nextDouble();
			result = num1 - num2;
			System.out.println("Ans" + result);
		case 3:
			System.out.println("Enter first number:");
			num1 = scanner.nextDouble();
			System.out.println("Enter second number:");
			num2 = scanner.nextDouble();
			result = num1 * num2;
			System.out.println("Ans" + result);
		case 4:
			System.out.println("Enter first number:");
			num1 = scanner.nextDouble();
			System.out.println("Enter second number:");
			num2 = scanner.nextDouble();
			result = num1 / num2;
			System.out.println("Ans" + result);
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}
