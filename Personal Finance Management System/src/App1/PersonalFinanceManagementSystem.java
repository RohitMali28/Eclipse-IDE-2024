package App1;

import java.util.HashMap;
import java.util.Scanner;

public class PersonalFinanceManagementSystem {
	private static HashMap<String, User> users = new HashMap<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hello, welcome to Personal Finance Management System!");
		captureUserInfo();
		mainMenu();
	}

	private static void captureUserInfo() {
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your initial income: ");
		double income = scanner.nextDouble();
		users.put(name, new User(name, income));
	}

	private static void mainMenu() {
		User currentUser = users.values().iterator().next();
		int choice;

		do {
			System.out.println("\nMain Menu:");
			System.out.println("1. Add Income");
			System.out.println("2. Add Expense");
			System.out.println("3. View Balance");
			System.out.println("4. View Transactions");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				addTransaction(currentUser, "income");
				break;
			case 2:
				addTransaction(currentUser, "expense");
				break;
			case 3:
				viewBalance(currentUser);
				break;
			case 4:
				viewTransactions(currentUser);
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 5);
	}

	private static void addTransaction(User user, String type) {
		System.out.print("Enter amount: ");
		double amount = scanner.nextDouble();
		String category = "";
		if (type.equals("expense")) {
			System.out.print(
					"Enter expense category (food, petrol, grocery, Electriciy bill, Trip, rent, entertainment): ");
			category = scanner.next();
		}
		user.addTransaction(new Transaction(type, amount, category));
		System.out.println("Transaction added successfully!");
	}

	private static void viewBalance(User user) {
		double balance = user.calculateBalance();
		System.out.printf("Current Balance: %.2f%n", balance);
		if (balance > 0) {
			System.out.println("You’re saving well!");
		} else {
			System.out.println("You’re in debt. Try to cut down on expenses.");
		}
	}

	private static void viewTransactions(User user) {
		System.out.println("Transaction History:");
		for (Transaction transaction : user.getTransactions()) {
			System.out.println(transaction);
		}
	}
}