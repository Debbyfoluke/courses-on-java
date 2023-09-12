package java_course_part1;

public class MortgageCalculator {


    public static void main(String[] args) {
       int  principal = (int) console.readNumber("principal ", 1000, 1_000_000);
       float  annualInterest = (float) console.readNumber("annual Interest Rate: ", 1, 30);
        byte years = (byte) console.readNumber("Period (Years): ", 1, 30);

         var calculator = new MortgageCalculator2(principal, annualInterest, years);
         var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentShedule();
    }

}
