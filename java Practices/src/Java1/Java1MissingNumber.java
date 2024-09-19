package Java1;

import java.util.Scanner;

public class Java1MissingNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numer Seperated by commas:");
		String input = scanner.nextLine();
		String[] numbers = input.split(",");
		int[] numArray = new int[numbers.length + 1];
		for (int i = 0; i < input.length(); i++) {
			numArray[i] = Integer.parseInt(numbers[i]);
		}
		int sumOfNaturalNumbers = (numArray.length * (numArray.length + 1)) / 2;
		int sumOfGivenNumbers = 0;
		for (int i = 0; i < input.length(); i++) {
			sumOfGivenNumbers += numArray[i];
		}
		int missingNumber = sumOfNaturalNumbers - sumOfGivenNumbers;
		System.out.println("Missing Number is: " + missingNumber);
	}

}
