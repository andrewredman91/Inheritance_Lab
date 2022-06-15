import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Peter", "JH32", 23000.00);
    }

    @Test
    public void getName(){
        assertEquals("Peter", databaseAdmin.getName());
    }

    @Test
    public void getNiNumber(){
        assertEquals("JH32", databaseAdmin.getNI());
    }

    @Test
    public void getSalary(){
        assertEquals(23000.00, databaseAdmin.getSalary(),0.00);
    }

    @Test
    public void getRaise(){
        databaseAdmin.getNewSalary(2000.00);
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void payBonus() {
        databaseAdmin.payBonus();
        assertEquals(230.00,databaseAdmin.payBonus(), 0.00);
    }
}
