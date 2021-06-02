package day22;

public class Concatenator {
    // modifier
    // class keyword
    // class name
    // brackets
    // body

    private String color;

    // constructor - used for creating an object
    // field (attribute) - variable providing the state of the object
    // method - behaviour of the object

    // method
    public String concatenate(String argument1, String argument2) {
        System.out.println(argument1 + argument2);
        return argument1 + argument2;
    }

    public static void main(String[] args) {
        Concatenator example1 = new Concatenator();
        Concatenator example2 = new Concatenator();
        Concatenator example3 = new Concatenator();
        Concatenator example4 = example3;
        String var1 = "arg1";
        String var2 = "arg2";

        System.out.println(example1.concatenate(var1, var2));
        System.out.println(example1 == example2);
        System.out.println(example3 == example4);
    }

    // calling a method
    // method can be of type void

    // object - instance of a class, basic unit of OOP, instance of a class
    // object interacts with each other by methods and have state by fields
    // object has: state, behaviour, identity (uniqueness)

    // what is object oriented?
}
