package day25_26.inheritance.animal;

/**
 * @author piotr
 */
public class Spider extends Animal {

    private String name;

    private String type;

    private String alias;

    public Spider(String name) {
        this(name, "type");
        System.out.println("after this");
        this.name = name;
        System.out.println("end of spider public");
    }

    private Spider(String name, String type) {
        super("brown", "printSomething");
        System.out.println("after super");
        this.name = name;
        this.type = type;
        System.out.println("end of spider private");
    }

    Spider(String name, String type, String alias) {
        super("brown");
        this.name = name;
        this.type = type;
        this.alias = alias;
    }
}
