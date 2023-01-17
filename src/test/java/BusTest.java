import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;

    private Person person;


    @Before
    public void before(){
        bus = new Bus("Kings cross", 3);
        person = new Person();
        bus.addPassenger(person);
    }

    @Test
    public void currentPassengers(){
       assertEquals( 1,bus.passengerCount());
    }
    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);

        assertEquals(3,bus.passengerCount());
    }

    @Test
    public void removePassenger(){
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

}
