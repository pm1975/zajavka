package day36_enum;

public enum Voltswagen {
    PASSAT("white", 2020),
    GOLF("red", 1020),
    ARTEON("green", 3040),
    TIGUAN("blue", 2021),
    TUAREG("brown", 3020);

    private String colors;

    private int productionYear;

    Voltswagen(String colors, int productionYear) {
        this.colors = colors;
        this.productionYear = productionYear;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Voltswagen{" +
                "colors='" + colors + '\'' +
                ", productionYear=" + productionYear +
                "} " + super.toString();
    }
}
