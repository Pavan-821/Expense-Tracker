import java.util.Date;
import java.util.Scanner;

public class ExpenseManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User registration
        System.out.println("Register a new user.");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        UserRegistration.registerUser(username, password);

        // Adding expenses
        System.out.println("Add an expense.");
        System.out.print("Category: ");
        String category = scanner.nextLine();
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        ExpenseEntry.addExpense(category, amount, new Date());

        // Listing all expenses
        System.out.println("All expenses:");
        ExpenseListing.listExpenses();

        // Summing by category
        System.out.println("Category-wise summary:");
        ExpenseSummary.categoryWiseSum();

        // Saving data
        DataPersistence.saveData();

        // Loading data
        DataPersistence.loadData();
    }
}
