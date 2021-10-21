package day30.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car[] arr = new Car[1000];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = new Cabriolet(i % 4 == 0);
            } else {
                arr[i] = new SUV(1 + (double)i/100);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("iter: " + i);
            arr[i].describe();
            openDoor(arr[i]);
        }
    }

    private static void openDoor(Car car) {
        System.out.println("I'm opening the door of the car: " + car);
    }
}
