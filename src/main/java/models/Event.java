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



//    public int guestPrice() {
//        if (15 > this.guests) {
//            this.price += 100;
//        } else if ((this.guests >= 15) && (this.guests <= 50)) {
//            this.price += 200;
//        } else if ((this.guests > 50) && (this.guests <= 100)) {
//            this.price += 300;
//        } else if ((this.guests > 100) && (this.guests <= 300)) {
//            this.price += 300;
//        }
//        else { return 0;
//        }
//        return this.price;
//    }

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
