package java_course_part1;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private  MortgageCalculator2 calculator;

    public MortgageReport(MortgageCalculator2 calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentShedule() {
        System.out.println();
        System.out.println("PAYMENTS");
        System.out.println("___________");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("________");
        System.out.println("Monthly Payments:" + mortgageFormatted);
    }
}
