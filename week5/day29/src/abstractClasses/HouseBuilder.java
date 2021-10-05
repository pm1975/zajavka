package abstractClasses;

public abstract class HouseBuilder {
    public void buildMyHouse() {
        cutTheTreesOff();
        makeTheHoleInTheGround();
        makeTheFoundations();
        buildTheWalls();
        makeTheRoof();
    }

    protected abstract void makeTheRoof();

    protected abstract void buildTheWalls();

    protected abstract void makeTheFoundations();

    protected abstract void makeTheHoleInTheGround();

    protected abstract void cutTheTreesOff();
}
