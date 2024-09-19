package Java2;

import java.util.Scanner;

public class KmtoMilesconvert {
	public static void main(String[] args) {
		double Length;
		Scanner rm = new Scanner(System.in);
		System.out.println("Enter Distance in Km: ");
		Length = rm.nextInt();
		Length = Length / 1.60934;
		System.out.println("The Distance in miles :" + Length);
	}
}
