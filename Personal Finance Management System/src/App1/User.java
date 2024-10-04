package App1;

import java.util.ArrayList;

public class User {
    private String name;
    private double income;
    private ArrayList<Transaction> transactions;

    public User(String name, double income) {
        this.name = name;
        this.income = income;
        this.transactions = new ArrayList<>();
    }

    public String getName() { return name; }
    public double getIncome() { return income; }
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public ArrayList<Transaction> getTransactions() { return transactions; }
    
    public double calculateBalance() {
        double totalIncome = transactions.stream()
                .filter(t -> t.getType().equals("income"))
                .mapToDouble(Transaction::getAmount)
                .sum();
        double totalExpenses = transactions.stream()
                .filter(t -> t.getType().equals("expense"))
                .mapToDouble(Transaction::getAmount)
                .sum();
        return totalIncome - totalExpenses;
    }
}