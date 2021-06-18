package day25_26.inheritance.initBlocks;

/**
 * @author piotr
 */
public class Cabriolet {

    {
        printDuringInitBlock(4);
    }

    {
        printDuringInitBlock(2);
    }

    {
        company = "Audi";
        printDuringInitBlock(1);
    }

    public Cabriolet() {
        System.out.println(Cabriolet.class + " constructor called");
    }

    private void printDuringInitBlock(int i) {
        System.out.println("I'm printing during init block in " + Cabriolet.class + " block number " + i);
    }

    {
        printDuringInitBlock(3);
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                "} " + super.toString();
    }

    private String company;

    private String model = initModel();

    private String color = initColor();

    private String initColor() {
        System.out.println("initializing color");
        return "red";
    }

    private String initModel() {
        System.out.println("initializing model");
        return"A4";
    }
}
