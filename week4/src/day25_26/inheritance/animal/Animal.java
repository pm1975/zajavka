package day25_26.inheritance.animal;

/**
 * @author piotr
 */
public class Animal {
    protected String color;

    public Animal() {
    }

    public Animal(String color) {
        this.color = color;
    }

    protected Animal(String color, String somethingToPrint) {
        System.out.println("Animal begining");
        this.color = color;
        System.out.println(somethingToPrint);
        System.out.println("Animal after something to print");
    }

    public String sound() {
        return "animal sound";
    }
}
