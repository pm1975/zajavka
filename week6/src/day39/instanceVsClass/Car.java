package day39.instanceVsClass;

public class Car {

    public static long publicStaticField;
    static long staticNumberOfCarsCreated;
    final String packageFieldFinal;
    long numberOfCarsCreated;
    private final String company;
    private final String model;
    private final int productionYear;
    private final SteeringWheel sterringWheel;

    public Car() {
        this.company = "BMW";
        this.model = "XS";
        this.productionYear = 2020;
        this.sterringWheel = new SteeringWheel(0.35);
        horn();
        numberOfCarsCreated++;
        staticNumberOfCarsCreated++;
        packageFieldFinal = "static final";
    }


    public void horn() {
        System.out.println("Car horn!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", sterringWheel=" + sterringWheel +
                '}';
    }
}
