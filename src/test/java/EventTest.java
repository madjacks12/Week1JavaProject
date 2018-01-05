package models;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void runEvent_instanceWorks_2() {
        Event testEvent = new Event(2,"chicken","soda","band",10, "10", "20", "30");
        assertEquals(true, testEvent instanceof Event);
    }
    @Test
    public void runEvent_getsGuests_2() {
        Event testEvent = new Event(2,"chicken","soda","band",10, "10", "20", "30");
        assertEquals(2, testEvent.getGuests());
    }
    @Test
    public void runEvent_getsFood_4() {
        Event testEvent = new Event(2,"chicken","soda","band",10, "10", "20", "30");
        assertEquals("chicken", testEvent.getFood());
    }
    @Test
    public void runEvent_getsBeverages_6() {
        Event testEvent = new Event(2,"chicken","soda","band",10, "10", "20", "30");
        assertEquals(6,  testEvent.getBev());
    }
    @Test
    public void runEvent_getsEnt_8() {
        Event testEvent = new Event(2,"chicken","soda","band",10, "10", "20", "30");
        assertEquals(8,  testEvent.getEnt());
    }
    @Test
    public void runEvent_guestsReturnsPrice_300() {
        Event testEvent = new Event(2,"chicken","soda","band",10, "10", "20", "30");

        assertEquals(300,  testEvent.guestPrice());
    }

}
