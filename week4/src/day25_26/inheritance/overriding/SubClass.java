package day25_26.inheritance.overriding;

/**
 * @author piotr
 */
public class SubClass extends SuperClass {
    @Override
    String defaultMethod() {
        return "subClass defaultMethod";
    }

    @Override
    protected String protectedMethod() {
        return "subClass protectedMethod";
    }

    @Override
    public String publicMethod() {
        System.out.println("print something");
        System.out.println(super.publicMethod());
        return "subClass publicMethod";
    }
//
//    @Override
//    public Animal animal(String color) {
//        return new Cat("name");
//    }
}
