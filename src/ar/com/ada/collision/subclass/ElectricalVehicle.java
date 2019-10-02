package ar.com.ada.collision.subclass;

import ar.com.ada.collision.superclass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    private Integer potency;

    public ElectricalVehicle() {

    }
    public ElectricalVehicle(Integer potency) {
        this.potency = potency;
    }
    public ElectricalVehicle(Integer potency, String brand, String model, Integer year) {
        this.potency = potency;
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
    }
    public void setPotency(Integer potency) {
        this.potency = potency;

    }
    public Integer getPotency(){
        return potency;
    }
    public String technicalSheet() {
        if (getYear() < 2007) {
            return "No existe modelo para este año.";
        } else {
            return "Vehículo eléctrico { marca = " + this.getBrand() +
                    ", modelo = " + this.getModel() +
                    ", año = " + this.getYear() +
                    " } Es un auto de última tecnología!";
        }
    }
    @Override
    public int hashCode() {
        return 41 * Objects.hash(getBrand(), getModel(), getYear(), potency);
    }
    @Override
    public String toString() {
        return "ElectricalVehicle { brand = " + getBrand() +
                ", model = " + getModel() +
                ", year = " + getYear() +
                ", potency = " + potency + " }";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof ElectricalVehicle)) return false;
        ElectricalVehicle that = (ElectricalVehicle) obj;
        return this.getBrand().equals(that.getBrand()) &&
                this.getYear().equals(that.getYear()) &&
                this.getModel().equals(that.getModel()) &&
                this.potency.equals(that.potency);
    }
}
