package Java1;

import java.util.Scanner;

public class creatingacoloumnandrow {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.print("Enter Square Side = ");
		int rows = sc.nextInt();

		System.out.println("Printing Same Numbers in Rows & Columns of a Square");

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j < rows + 1; j++) {
				System.out.print(j + " ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
