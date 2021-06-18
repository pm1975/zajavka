package day23;

import java.math.BigDecimal;

/**
 * @author piotr
 */
public class EqualsAndHashCode {
    public static void main(String[] args) {
        //equalsExample();

        Car car1 = new Car("Audi", "A4", 2018);
        Car car2 = new Car("Audi", "A4", 2018);
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(null));

        Dog dog = new Dog("ciapek");
        System.out.println(car1.equals(dog));

        System.out.println("hash1: " + car1.hashCode());
        System.out.println("hash2: " + car2.hashCode());
    }

    private static void equalsExample() {
        BigDecimal bd1 = new BigDecimal("0.3");
        BigDecimal bd2 = new BigDecimal("0.1");
        BigDecimal bd3 = new BigDecimal("0.2");
        System.out.println(bd1 == bd2.add(bd3));
        System.out.println(bd1.equals(bd2.add(bd3)));
    }
}
