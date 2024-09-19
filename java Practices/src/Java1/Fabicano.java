package Java1;

public class Fabicano {

	public static void main(String[] args) {
		int n = 10;

		int firstNumber = 0;
		int secondnumber = 1;
		System.out.println("fabiconi series " + n + "terms");
		for (int i = 0; i <= 5; ++i) {
			System.out.println(firstNumber);
			int nexterm = firstNumber + secondnumber;
			firstNumber = secondnumber;
			secondnumber = nexterm;
		}
	}
}
