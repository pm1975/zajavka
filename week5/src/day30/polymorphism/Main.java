package day30.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car cabriolet2 = new Cabriolet("blue", false);
        Car suv2 = new SUV("brown", 1.92);

        cabriolet2.describe();
        suv2.describe();
    }
}
