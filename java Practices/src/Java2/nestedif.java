package Java2;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		int marksObtained, passingmark;
		char grade;
		passingmark = 35;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Mark obtained by you");
		marksObtained = sc.nextInt();

		if (marksObtained >= passingmark) {
			if (marksObtained > 95)
				grade = 'A';
			else if (marksObtained > 90)
				grade = 'A';
			else if (marksObtained > 80)
				grade = 'B';
			else if (marksObtained > 70)
				grade = 'c';
			else if (marksObtained > 60)
				grade = 'D';
			else
				grade = 'D';
			System.out.println("You passed the Exam and your Grade is " + grade);
		} else {
			grade = 'F';
			System.out.println("you Failed and your Grade is " + grade);
		}
	}

}
