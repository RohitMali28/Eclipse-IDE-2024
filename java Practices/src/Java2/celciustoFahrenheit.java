package Java2;

import java.util.Scanner;

public class celciustoFahrenheit {
	public static void main(String[] args) {
		float temprature;
		Scanner rm = new Scanner(System.in);
		System.out.println("Enter Temprature in Celcius: ");
		temprature = rm.nextInt();
		temprature = temprature * 9 / 5 + 32;
		System.out.println("Temprature in Faherenheit: " + temprature);
	}
}
