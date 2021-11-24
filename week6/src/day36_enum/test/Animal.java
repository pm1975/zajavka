package day36_enum.test;

public enum Animal implements CanSwim {

    DOG(true),
    CAT(false),
    BIRD(false),
    FISH(true);

    private boolean canSwim;

    Animal(boolean canSwim) {
        this.canSwim = canSwim;
    }

    @Override
    public boolean canSwim() {
        return canSwim;
    }
}
