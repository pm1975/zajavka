package day25_26.inheritance.overriding;

import day25_26.inheritance.animal.Animal;

/**
 * @author piotr
 */
public class SuperClass {
    String defaultMethod() {
        return "superClass defaultMethod";
    }

    protected String protectedMethod() {
        return "superClass protectedMethod";
    }

    public String publicMethod() {
        return "superClass publicMethod";
    }

    public Animal animal(String color) {
        return new Animal(color);
    }
}
