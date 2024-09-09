import java.util.Comparator;
import java.util.List;

class ExpenseListing {
    public static void listExpenses() {
        for (Expense expense : ExpenseEntry.expenses) {
            System.out.println("Date: " + expense.date + ", Category: " + expense.category + ", Amount: " + expense.amount);
        }
    }

    public static void listExpensesByCategory(String category) {
        for (Expense expense : ExpenseEntry.expenses) {
            if (expense.category.equalsIgnoreCase(category)) {
                System.out.println("Date: " + expense.date + ", Amount: " + expense.amount);
            }
        }
    }

    public static void sortExpensesByAmount() {
        ExpenseEntry.expenses.sort(Comparator.comparingDouble(e -> e.amount));
        listExpenses();
    }
}
