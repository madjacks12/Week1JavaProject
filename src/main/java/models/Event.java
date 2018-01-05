package models;

public class Event {
    private int guests;
    private int food;

    public Event(int guests, int food) {
        this.guests = guests;
        this.food = food;


    }
    public int getGuests(){
        return this.guests;
    }
    public int getFood(){
        return this.food;
    }
}
