package Java2;

import java.util.Scanner;

public class Fahrenheittocelcius {

	public static void main(String[] args) {
		float temprature;
		Scanner rm = new Scanner(System.in);
		System.out.println("Enter Temprature in Faherenheit: ");
		temprature = rm.nextInt();
		temprature = (temprature - 32) * 5 / 9;
		System.out.println("Temprature in Celcius :" + temprature);
	}
}
