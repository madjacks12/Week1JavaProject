package models;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void runEvent_instanceWorks() {
        Event testEvent = new Event(2);
        assertEquals(true, testEvent instanceof Event);
    }
    @Test
    public void runEvent_getsGuests() {
        Event testEvent = new Event(2);
        assertEquals(2, testEvent.getGuests());
    }

}
