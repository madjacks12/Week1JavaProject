package models;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void runEvent_instanceWorks_2() {
        Event testEvent = new Event(2,4,6);
        assertEquals(true, testEvent instanceof Event);
    }
    @Test
    public void runEvent_getsGuests_2() {
        Event testEvent = new Event(2,4,6);
        assertEquals(2, testEvent.getGuests());
    }
    @Test
    public void runEvent_getsFood_4() {
        Event testEvent = new Event(2, 4,6);
        assertEquals(4, testEvent.getFood());
    }
    @Test
    public void runEvent_getsBeverages_6() {
        Event testEvent = new Event(2, 4, 6);
        assertEquals(6,  testEvent.getBev());
    }

}
