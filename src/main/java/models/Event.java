package models;

public class Event {
    private int guests;
    private int food;
    private int bev;

    public Event(int guests, int food, int bev) {
        this.guests = guests;
        this.food = food;
        this.bev = bev;


    }
    public int getGuests(){
        return this.guests;
    }
    public int getFood(){
        return this.food;
    }
    public int getBev(){
        return this.bev;
    }
}
