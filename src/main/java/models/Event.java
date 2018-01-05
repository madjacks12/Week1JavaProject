package models;

public class Event {
    private int guests;
    private int food;
    private int bev;
    private int ent;


    public Event(int guests, int food, int bev, int ent) {
        this.guests = guests;
        this.food = food;
        this.bev = bev;
        this.ent = ent;



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
    public int getEnt(){
        return this.ent;
    }
}
