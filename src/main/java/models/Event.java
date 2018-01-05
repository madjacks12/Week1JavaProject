package models;

public class Event {
    private int guests;
    private String food;
    private String bev;
    private String ent;
    private int guestPrice;
    private String foodPrice;
    private String bevPrice;
    private String entPrice;

    public Event(int guests, String food, String bev, String ent, int guestPrice, String foodPrice, String bevPrice, String entPrice) {
        this.guests = guests;
        this.food = food;
        this.bev = bev;
        this.ent = ent;
        this.guestPrice = guestPrice;
        this.foodPrice = foodPrice;
        this.bevPrice = bevPrice;
        this.entPrice = entPrice;
    }


    public int guestPrice() {
        if (15 > this.guests) {
            this.guestPrice += 100;
        } else if ((this.guests >= 15) && (this.guests <= 50)) {
            this.guestPrice += 200;
        } else if ((this.guests > 50) && (this.guests <= 100)) {
            this.guestPrice += 300;
        } else if ((this.guests > 100) && (this.guests <= 300)) {
            this.guestPrice += 300;
        } else {
            return 0;
        }
        return this.guestPrice;
    }


    public int getGuests() {
        return this.guests;
    }

    public String getFood() {
        return this.food;
    }

    public String getBev() {
        return this.bev;
    }

    public String getEnt() {
        return this.ent;
    }

    public int getGuestCost() {
        return this.guestPrice;
    }

    public String getFoodCost() {
        return this.foodPrice;
    }

    public String getBevCost() {
        return this.bevPrice;
    }

    public String getEntCost() {
        return this.entPrice;
    }

}