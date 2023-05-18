package com.collectionexercise;

import java.util.Objects;

public class Car implements Comparable {
    private String mark;
    private String model;
    private String year;

    public Car(String mark, String model, String year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(mark, car.mark) && Objects.equals(model, car.model) && Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, year);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
