package ar.com.ada.collision.superclass;

import java.util.Objects;

public class Vehicle {
    private String brand;
    private String model;
    private Integer year;

    public Vehicle() {

    }
    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public Integer getYear() {
        return year;
    }

    public String technicalSheet() {
        return this.toString() + "Este vehículo no tiene categoría asignada.";
    }

    @Override
    public int hashCode() {
        return -23 * Objects.hash(this.brand, this.model, this.year);
    }

    @Override
    public String toString() {
        return "Vehicle { brand = " + brand + ", model = " + model + ", year = " + year + " }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Vehicle)) return false;
        Vehicle that = (Vehicle) obj;
        return this.year.equals(that.year) && this.brand.equals(that.brand) && this.model.equals(that.model);
    }
}
