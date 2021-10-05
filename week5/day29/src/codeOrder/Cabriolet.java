package codeOrder;

public class Cabriolet {
    public String company;
    protected String model;
    String model1;
    private String color;

    {
        printDuringInitBlock(4);
    }

    public Cabriolet() {
    }

    public Cabriolet(String company, String model, String model1, String color) {
        this.company = company;
        this.model = model;
        this.model1 = model1;
        this.color = color;
    }

    private void printDuringInitBlock(int i) {
        System.out.println("I'm printing durint init blok in " + Cabriolet.class + " block number " + i);
    }

    private String initColor() {
        System.out.println("initializing color");
        return "red";
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", model1='" + model1 + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel1() {
        return model1;
    }

    public void setModel1(String model1) {
        this.model1 = model1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
