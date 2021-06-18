package day24.reference;

/**
 * @author piotr
 */
public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
