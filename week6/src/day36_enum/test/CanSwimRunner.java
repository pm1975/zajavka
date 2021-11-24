package day36_enum.test;

public class CanSwimRunner {
    public static void main(String[] args) {
        System.out.println(Animal.DOG);
        System.out.println(Animal.DOG.name());
        System.out.println(Animal.DOG.ordinal());
        System.out.println(Animal.DOG.canSwim());
    }
}
