package ar.com.ada.collision.subclass;

import ar.com.ada.collision.superclass.Vehicle;

import java.util.Objects;

public class SportsVehicle extends Vehicle {
    private Integer rpm;

    public SportsVehicle() {

    }
    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }
    public SportsVehicle(Integer rpm, String brand, String model, Integer year) {
        this.rpm = rpm;
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }
    public Integer getRpm() {
        return rpm;
    }

    public String technicalSheet() {
        if (this.rpm <= 50 && this.rpm >= 0) {
            return "SportsVehicle { marca = " + getBrand() +
                    ", modelo = " + getModel() +
                    ", año = " + getYear() +
                    " } El auto es muy bonito, pero solo sirve para salir a pasear.";
        } else if (this.rpm <= 300) {
            return "SportsVehicle { marca = " + getBrand() +
                    ", modelo = " + getModel() +
                    ", año = " + getYear() +
                    " } Con este auto puedes desafiar a cualquiera en la pista.";
        } else if (this.rpm <= 600) {
            return "SportsVehicle { marca = " + getBrand() +
                    ", modelo = " + getModel() +
                    ", año = " + getYear() +
                    " } Si tienes este auto, debes considerar participar en NASCAR.";
        } else {
            return "SportsVehicle { marca = " + getBrand() +
                    ", modelo = " + getModel() +
                    ", año = " + getYear() +
                    " } ¿Eres parte del elenco de Rápidos y Furiosos?";
        }
    }

    @Override
    public int hashCode() {
        return -32 * Objects.hash(getBrand(), getModel(), getYear(), rpm);
    }
    @Override
    public String toString() {
        return "ElectricalVehicle { brand = " + getBrand() +
                ", model = " + getModel() +
                ", year = " + getYear() +
                ", rpm = " + rpm + " }";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof SportsVehicle)) return false;
        SportsVehicle that = (SportsVehicle) obj;
        return this.getBrand().equals(that.getBrand()) &&
                this.getYear().equals(that.getYear()) &&
                this.getModel().equals(that.getModel()) &&
                this.rpm.equals(that.rpm);
    }
}
