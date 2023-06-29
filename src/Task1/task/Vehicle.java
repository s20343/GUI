package Task1.task;

import java.math.BigDecimal;
import java.time.LocalDate;



public abstract class Vehicle {
    private Producer producer;
    private LocalDate dateOfManufacture;
    private int Mileage;
    private boolean low_floor;
    private boolean articulated;
    private Fuel myFuel;
    private BigDecimal Engine;

    public Vehicle(Producer producer, LocalDate dateOfManufacture,  boolean low_floor, boolean articulated, Fuel myFuel, BigDecimal Engine) {
        this.producer = producer;
        this.dateOfManufacture = dateOfManufacture;
        this.low_floor = low_floor;
        this.articulated = articulated;
        this.myFuel = myFuel;
        this.Engine = Engine;
    }
    public Producer getProducer() {
        return producer;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public boolean isArticulated() {
        return articulated;
    }

    public boolean isLow_floor() {
        return low_floor;
    }

    public int getMileage() {
        return Mileage;
    }

    public void setMileage(int mileage) {
        Mileage = mileage;
    }

    public void setFuel(Fuel fuel){
        myFuel = fuel;
    }

    public Fuel getMyFuel() {
        return myFuel;
    }

    public BigDecimal getEngine() {
        return Engine;
    }

    public abstract int CalculateAgeOfVehicle();
}
