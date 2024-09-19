package Java2;

import java.util.Scanner;

public class aaaa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value in kilometers: ");
		double kilometers = sc.nextDouble();
		double miles = kilometers * 0.621371;
		System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
	}
}
