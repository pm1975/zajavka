package day24;

import day23.Car;

/**
 * @author piotr
 */
public class ToString {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "A.Class", 2010);
        Car car2 = new Car("BMW", "X1", 2009);
        Car car3 = new Car("Volkswagen", "Golf", 2015);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
