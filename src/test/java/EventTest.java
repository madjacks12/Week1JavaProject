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
        assertEquals("soda",  testEvent.getBev());
    }
    @Test
    public void runEvent_getsEnt_8() {
        Event testEvent = new Event(2,"chicken","soda","band",10, "10", "20", "30");
        assertEquals("band",  testEvent.getEnt());
    }
    @Test
    public void runEvent_guestsCalculatesPrice_100() {
        Event testEvent = new Event(2,"chicken","soda","band",0, "10", "20", "30");

        assertEquals(100,  testEvent.guestPriceCalc());
    }
    @Test
    public void runEvent_foodReturnsPrice_10() {
        Event testEvent = new Event(2,"chicken","soda","band",0, "10", "20", "30");

        assertEquals("10",  testEvent.getFoodCost());
    }
    @Test
    public void runEvent_bevReturnsPrice_20() {
        Event testEvent = new Event(2,"chicken","soda","band",0, "10", "20", "30");

        assertEquals("20",  testEvent.getBevCost());
    }
    @Test
    public void runEvent_entReturnsPrice_30() {
        Event testEvent = new Event(2,"chicken","soda","band",0, "10", "20", "30");

        assertEquals("30",  testEvent.getEntCost());
    }
    @Test
    public void runEvent_foodCalculatesCost_100() {
        Event testEvent = new Event(2,"chicken","soda","band",0, "10", "20", "30");

        assertEquals("150",  testEvent.foodPriceCalc());
    }
}
