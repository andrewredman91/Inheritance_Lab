import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest{
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jasper", "JH64", 123000.00);
    }

    @Test
    public void getName(){
        assertEquals("Jasper", developer.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JH64", developer.getNI());
    }

    @Test
    public void getSalary(){
        assertEquals(123000.00, developer.getSalary(),0.00);
    }

    @Test
    public void getRaise(){
        developer.getNewSalary(2000.00);
        assertEquals(125000.00, developer.getSalary(), 0.00);
    }

    @Test
    public void payBonus() {
        developer.payBonus();
        assertEquals(1230.00,developer.payBonus(), 0.00);
    }
}