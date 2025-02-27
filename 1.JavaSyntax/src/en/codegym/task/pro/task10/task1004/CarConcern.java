package en.codegym.task.pro.task10.task1004;

import java.time.LocalDate;

/*
Need for speed
*/

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this(model, year, "Orange");
    }

    public CarConcern(String model) {
        this(model, LocalDate.now().getYear(), "Orange");
    }
}
