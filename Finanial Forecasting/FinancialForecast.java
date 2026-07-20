public class FinancialForecast {
    public static void main(String[] args) {
        double currentRevenue = 50000.0;
        double currentExpense = 35000.0;
        double monthlyGrowthRate = 0.05; // 5% growth
        int months = 12;

        System.out.println("Financial Forecast Report");
        System.out.println("=========================");
        System.out.printf("Starting revenue: $%.2f\n", currentRevenue);
        System.out.printf("Starting expense: $%.2f\n", currentExpense);
        System.out.printf("Monthly growth rate: %.2f%%%n", monthlyGrowthRate * 100);
        System.out.printf("Forecast horizon: %d months\n\n", months);

        double revenue = currentRevenue;
        double expense = currentExpense;

        for (int month = 1; month <= months; month++) {
            revenue *= 1.0 + monthlyGrowthRate;
            expense *= 1.0 + monthlyGrowthRate * 0.6; // expense growth slower than revenue
            double profit = revenue - expense;
            System.out.printf("Month %2d: Revenue=$%.2f, Expense=$%.2f, Profit=$%.2f\n",
                    month, revenue, expense, profit);
        }
    }
}
