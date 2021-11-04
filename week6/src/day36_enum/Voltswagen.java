package day36_enum;

import java.util.LinkedList;
import java.util.List;

public enum Voltswagen implements MyExampleInterface {
    PASSAT("white", 2020) {
        @Override
        public Voltswagen getIfMissing() {
            return GOLF;
        }
    },
    GOLF("red", 1020){
        @Override
        public Voltswagen getIfMissing() {
            return ARTEON;
        }
    },
    ARTEON("green", 3040){
        @Override
        public Voltswagen getIfMissing() {
            return TUAREG;
        }
    },
    TIGUAN("blue", 2021){
        @Override
        public Voltswagen getIfMissing() {
            return PASSAT;
        }
    },
    TUAREG("brown", 3020){
        @Override
        public Voltswagen getIfMissing() {
            return TIGUAN;
        }
    };

    private String color;

    private int productionYear;

    Voltswagen(String colors, int productionYear) {
        this.color = colors;
        this.productionYear = productionYear;
    }

//    public static List<Voltswagen> ofColor(String color) {
//        List<Voltswagen> result = new LinkedList<>();
//        for (Voltswagen value : values()) {
//            if (color.equals(value.getColor())) {
//                result.add(value);
//            }
//        }
//        return result;
//    }
    public static Voltswagen ofColor(String color) {
        for (Voltswagen value : values()) {
            if (color.equals(value.getColor())) {
                return value;
            }
        }
        throw new IllegalArgumentException("Color: " + color + " not found");
    }

    public abstract Voltswagen getIfMissing();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String doSomething() {
        return productionYear + "ohoho";
    }
}
