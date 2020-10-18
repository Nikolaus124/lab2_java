
package test;
import classes.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.LocalDate;

import static org.testng.Assert.assertEquals;

public class TestLab2 {
    Customers cus = new Customers(1, "Peter", "Steven", "21-04-2001", 56464,"+38054123678",656454);
    Employees emp = new Employees(1, "John", "Inc", "2017-1-25", 55448749,"+38054123678");
    TransportIns ins = new TransportIns.Builder()
            .idi(1)
            .sn(156024)
            .cust(cus)
            .emp(emp)
            .instype("Full")
            .crd("20-03-2013")
            .term(1.5)
            .amount(2300)
            .Type("Truck")
            .Fuel("Diesel")
            .Engcap(3.5)
            .Brand("KAMAZ")
            .Model("125")
            .VIN("WWAUZ354VAND")
            .build();
    @Test
    public void builderTest1() {
        assertEquals(1,ins.getId());
    }

    @Test
    public void builderTest2() {
        assertEquals(156024,ins.getSn());
    }

    @Test
    public void builderTest3() {
        assertEquals("Full",ins.getInstype());
    }

    @Test
    public void builderTest4() {
        assertEquals("20-03-2013",ins.getCrd());
    }
    @Test
    public void builderTest5() {
        assertEquals(1.5,ins.getTerm());
    }
    @Test
    public void builderTest6() {
        assertEquals(2300,ins.getAmount());
    }
    @Test
    public void builderTest7() {
        assertEquals("Truck",ins.getType());
    }
    @Test
    public void builderTest8() {
        assertEquals("Diesel",ins.getFuel());
    }
    @Test
    public void builderTest9() {
        assertEquals(3.5,ins.getEngcap());
    }
    @Test
    public void builderTest10() {
        assertEquals("KAMAZ",ins.getBrand());
    }
    @Test
    public void builderTest11() {
        assertEquals("125",ins.getModel());
    }

    @Test
    public void builderTest12() {
        assertEquals("WWAUZ354VAND",ins.getVin());
    }
}

