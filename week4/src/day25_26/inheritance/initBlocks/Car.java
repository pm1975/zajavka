package day25_26.inheritance.initBlocks;

/**
 * @author piotr
 */
public class Car {

    {
        this.productionYear = "2020";
        printDuringInitBlock();
    }

    private String productionYear;

    public Car() {
        System.out.println(Car.class + " constructor called");
    }

    private void printDuringInitBlock() {
        System.out.println("I'm printing during init block in " + Car.class);
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear='" + productionYear + '\'' +
                '}';
    }
}
