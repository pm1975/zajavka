package day33.garbage;

public class Cat3 {
    private String name;
    private String color;
    private String aga;
    private String hoursOfSleeping;

    public Cat3 setName(String name) {
        this.name = name;
        return this;
    }

    public Cat3 setColor(String color) {
        this.color = color;
        return this;
    }

    public Cat3 setAga(String aga) {
        this.aga = aga;
        return this;
    }

    public Cat3 setHoursOfSleeping(String hoursOfSleeping) {
        this.hoursOfSleeping = hoursOfSleeping;
        return this;
    }

    @Override
    public String toString() {
        return "Cat3{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", aga='" + aga + '\'' +
                ", hoursOfSleeping='" + hoursOfSleeping + '\'' +
                '}';
    }
}
