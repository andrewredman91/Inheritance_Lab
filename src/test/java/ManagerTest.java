import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Andy", "JH14", 25000.00, "Vendor Returns");
    }

    @Test
    public void getName(){
        assertEquals("Andy", manager.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JH14", manager.getNI());
    }

    @Test
    public void getSalary(){
        assertEquals(25000.00, manager.getSalary(),0.00);
    }

    @Test
    public void getRaise(){
        manager.getNewSalary(2000.00);
        assertEquals(27000.00, manager.getSalary(), 0.00);
    }

    @Test
    public void payBonus() {
        manager.payBonus();
        assertEquals(250.00,manager.payBonus(), 0.00);
    }
}
