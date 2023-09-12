package java_course_part2_oop;

public class LogicalOperator {
    public static void main(String[] args) {
//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    }
}