package abstractClasses;

public abstract class Dog extends Animal {

    private String name;

    public Dog(String color, String name) {
        super(color);
        this.name = name;
    }
}
