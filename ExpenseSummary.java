import java.util.HashMap;

class ExpenseSummary {
    public static void categoryWiseSum() {
        HashMap<String, Double> categorySum = new HashMap<>();

        for (Expense expense : ExpenseEntry.expenses) {
            categorySum.put(expense.category, categorySum.getOrDefault(expense.category, 0.0) + expense.amount);
        }

        for (String category : categorySum.keySet()) {
            System.out.println("Category: " + category + ", Total: " + categorySum.get(category));
        }
    }
}
