package day25_26.inheritance.animal;

/**
 * @author piotr
 */
public class Cat extends Animal {
    private String name;

    public Cat(String name) {
        super("black");
        this.name = name;
    }

    public Cat(String color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
