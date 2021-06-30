package day23;

import java.util.Objects;

/**
 * @author piotr
 */
public class Car {
    private String company;
    private String model;
    private int productionYear;

    //this - differ method local args

    public Car(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }

    // equals principles
    // - x.equals(x) should be always true


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return productionYear == car.productionYear &&
                Objects.equals(company, car.company) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, productionYear);
    }

   // - x.equals(x) == true -> x.hashCode() == y.hashCode()


    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
