package day25_26.inheritance.animal;

/**
 * @author piotr
 */
public class Monkey extends Animal {
    private String name;

    public Monkey(String color, String name) {
        super(color);
        this.name = name;
    }
}
