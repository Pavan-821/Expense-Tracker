import java.util.ArrayList;
import java.util.Date;

class Expense {
    String category;
    double amount;
    Date date;

    Expense(String category, double amount, Date date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }
}

class ExpenseEntry {
    static ArrayList<Expense> expenses = new ArrayList<>();

    public static void addExpense(String category, double amount, Date date) {
        Expense expense = new Expense(category, amount, date);
        expenses.add(expense);
        System.out.println("Expense added.");
    }
}
