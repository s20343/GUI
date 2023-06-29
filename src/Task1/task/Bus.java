package Task1.task;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Bus extends Vehicle {
    private int ageOfVehicle;

    public Bus(Producer producer, LocalDate dateOfManufacture, boolean low_floor, boolean articulated, Fuel myFuel, BigDecimal Engine) {
        super(producer, dateOfManufacture, low_floor, articulated, myFuel, Engine);
    }


    @Override
    public int CalculateAgeOfVehicle() {
        ageOfVehicle = Period.between(this.getDateOfManufacture(), LocalDate.now()).getYears();
        return ageOfVehicle;
}

    public int getAgeOfVehicle() {
        return ageOfVehicle;
    }

    @Override
    public String toString() {
        return "Task1.Task2.Task6.task.Producer :" + getProducer() +"  --- "+ " Date of Manufacture : " + getDateOfManufacture() +
                "  --- "+ " Low floor : " + isLow_floor() +"  --- "+ " Articulated : " + isArticulated()
                +"  --- "+ " Task1.Task2.Task6.task.Fuel type : " + getMyFuel() +"  --- "+ " Engine Capacity : " + getEngine() +
                "  --- " + "Age of Task1.Task2.Task6.task.Vehicle : " + this.CalculateAgeOfVehicle() +"  --- " + "Mileage : " + getMileage() ;
    }
}

