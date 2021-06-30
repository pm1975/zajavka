package day25_26.inheritance.animal;

/**
 * @author piotr
 */
public class Dog extends Animal {
    private String name;

    public Dog(String color, String name) {
        super(color);
        this.name = name;
    }

    public void mySpider() {
        Spider spider = new Spider("name", "type", "alias");
    }
}
