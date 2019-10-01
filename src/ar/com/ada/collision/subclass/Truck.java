package ar.com.ada.collision.subclass;

import ar.com.ada.collision.superclass.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {
    private Integer maxLoad;

    public Truck() {

    }
    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }
    public Truck(Integer maxLoad, String brand, String model, Integer year) {
        this.maxLoad = maxLoad;
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
    }
    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }
    public Integer getMaxLoad() {
        return maxLoad;
    }

    public String technicalSheet() {
        if (maxLoad <= 100) {
            return "Truck { marca = " + getBrand() +
                    ", modelo = " + getModel() +
                    ", año = " + getYear() +
                    " } Para iniciar un negocio de flete, está muy bien este auto.";
        } else {
            return "Truck { marca = " + getBrand() +
                    ", modelo = " + getModel() +
                    ", año = " +  getYear() +
                    " } Tienes que usar este auto en el campo, es una máquina de trabajo!!";
        }
    }

    @Override
    public int hashCode() {
        return -52 * Objects.hash(getBrand(), getModel(), getYear(), maxLoad);
    }
    @Override
    public String toString() {
        return "ElectricalVehicle { brand = " + getBrand() +
                ", model = " + getModel() +
                ", year = " + getYear() +
                ", maxLoad = " + maxLoad + " }";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Truck)) return false;
        Truck that = (Truck) obj;
        return this.getBrand().equals(that.getBrand()) &&
                this.getYear().equals(that.getYear()) &&
                this.getModel().equals(that.getModel()) &&
                this.maxLoad.equals(that.maxLoad);
    }
}
