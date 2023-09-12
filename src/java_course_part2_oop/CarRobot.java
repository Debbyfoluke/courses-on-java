package java_course_part2_oop;

public class CarRobot {
    public int age;

    public String brand;

    public String model;

    public int speedoMeter;

    public boolean isAutomatic;

    public boolean isOpenRoof;

    public int tyreSize;

    public String trafficator;
    public CarRobot(
            int age,
            String brand,
            String model,
            int speedoMeter,
            boolean isAutomatic,
            boolean isOpenRoof,
            int tyreSize,
            String trafficator
    ){
        this.age =age;
        this.brand =brand;
        this.model = model;
        this.speedoMeter = speedoMeter;
        this.isAutomatic =isAutomatic;
        this.isOpenRoof =isOpenRoof;
        this.tyreSize = tyreSize;
        this.trafficator = trafficator;

    }
}



