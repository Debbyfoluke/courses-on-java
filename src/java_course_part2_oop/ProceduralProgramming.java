package java_course_part2_oop;

public class ProceduralProgramming {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.getBaseSalary();
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);


//       int baseSalary = 50_000;
//       int extraHours = 10;
//       int hourlyRate = 20;
//
//      int wage = calculateWage(baseSalary,extraHours,hourlyRate);
//        System.out.println(wage);
//    }
//
//    public static int calculateWage(
//      int baseSalary,
//      int extraHours,
//      int hourlyRate
//    ) {
//          return baseSalary + (extraHours * hourlyRate);
    }

}
