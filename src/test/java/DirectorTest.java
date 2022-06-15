import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Jock", "JH15", 40000.00, "Vendors", 500.00);
    }

    @Test
    public void canGetBudget(){
        assertEquals(500.00,director.getBudget(),0.00);
    }
}
