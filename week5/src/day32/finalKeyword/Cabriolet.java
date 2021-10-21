package day32.finalKeyword;

public final class Cabriolet {

    private final  boolean roofOpened;

    private final String color;

    public Cabriolet(boolean roofOpened, String color) {
        this.roofOpened = roofOpened;
        this.color = color;
    }

    public boolean isRoofOpened() {
        return roofOpened;
    }

    public String getColor() {
        return color;
    }

    public Cabriolet closeTheRoof() {
        return new Cabriolet(false, this.color);
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "roofOpened=" + roofOpened +
                ", color='" + color + '\'' +
                '}';
    }
}
