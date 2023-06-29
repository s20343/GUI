package Task1.task.test;
import static org.junit.Assert.*;

import org.junit.Test;
import Task1.task.Bus;
import Task1.task.Producer;
import Task1.task.Fuel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;



public class Fueltest {

    @Test
    public void testProducerName() {
        Producer mercedes=new Producer("Mercedes");
        Bus bus1=new Bus(mercedes,LocalDate.of(2016,Month.SEPTEMBER,6),true,false,Fuel.OIL,new BigDecimal("6.0"));
        assertEquals(bus1.getProducer().toString(),"Mercedes");

    }
    @Test
    public void testFuel() {
        Producer mercedes=new Producer("Mercedes");
        Bus bus1=new Bus(mercedes,LocalDate.of(2016,Month.SEPTEMBER,6),true,false,Fuel.OIL,new BigDecimal("6.0"));
        assertEquals(bus1.getMyFuel().toString(),"OIL");

    }

}