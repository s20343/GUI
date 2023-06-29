package Task1.task;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Producer mercedes=new Producer("Mercedes");
        Producer ford=new Producer("Ford");
        Producer jdcecaux=new Producer("JCDecaux");

       Bus bus1=new Bus(mercedes,LocalDate.of(2016,Month.SEPTEMBER,6),true,false,Fuel.OIL,new BigDecimal("6.0"));
       Bus bus2=new Bus(ford,LocalDate.of(1985,Month.FEBRUARY,25),false,true,Fuel.GAS,new BigDecimal("4.0"));
       Tram tram1=new Tram(jdcecaux,LocalDate.of(2018,Month.MAY,10),true,true,Fuel.ELECTRICITY,new BigDecimal("0"));
       Tram tram2=new Tram(jdcecaux,LocalDate.of(2008,Month.AUGUST,20),false,false,Fuel.ELECTRICITY,new BigDecimal("0"));

       bus1.setMileage(75000);
       bus2.setMileage(450000);
       tram1.setMileage(50000);
       tram2.setMileage(175000);


       System.out.println();

       System.out.println(bus1);
       System.out.println(bus2);
       System.out.println(tram1);
       System.out.println(tram2);
    }
}
