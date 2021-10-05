package abstractClasses;

public abstract class Animal {

    private String color;

    public Animal(String color) {
        this.color = color;
    }

    //private - doesn't work sweetie
    abstract String gimmeVoice();
}
