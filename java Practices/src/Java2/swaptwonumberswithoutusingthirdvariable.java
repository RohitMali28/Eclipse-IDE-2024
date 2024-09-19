package Java2;

import java.util.Scanner;

public class swaptwonumberswithoutusingthirdvariable {

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Enter a Value of x and Y");
		sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping " + x + " " + y);
	}

}
