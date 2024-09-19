package Java2;

import java.util.Scanner;

public class kmtomiles {
	public static void main(String[] args) {
		double Length;
		Scanner rm = new Scanner(System.in);
		System.out.println("Enter Distance in miles: ");
		Length = rm.nextInt();
		Length = Length / 0.621371;
		System.out.println("The Distance in Km : " + Length);
	}
}
