package models;

public class Event {
    private int guests;
    private int food;
    private int bev;
    private int ent;
    private int price;

    public Event(int guests, int food, int bev, int ent, int price) {
        this.guests = guests;
        this.food = food;
        this.bev = bev;
        this.ent = ent;
        this.price = price;
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
    public int getPrice(){
        return this.price;
    }
}
