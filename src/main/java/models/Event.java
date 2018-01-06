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


    public Event(int guests, String food, String bev, String ent) {
        this.guests = guests;
        this.food = food;
        this.bev = bev;
        this.ent = ent;
    }


    public int guestPriceCalc() {
        if (15 > this.guests) {
            guestPrice += 100;
        } else if ((this.guests >= 15) && (this.guests <= 50)) {
            guestPrice += 200;
        } else if ((this.guests > 50) && (this.guests <= 100)) {
            guestPrice += 300;
        } else if ((this.guests > 100) && (this.guests <= 300)) {
            guestPrice += 300;
        } else {
            return 0;
        }
        return guestPrice;
    }

    public String foodPriceCalc() {
        if (this.food == "chicken") {
            foodPrice += "150";
        } else if (this.food == "steak") {
            foodPrice += "200";
        } else if (this.food == "vegetarian") {
            foodPrice += "100";
        } else {
            return "Please enter 'chicken', 'steak' or 'vegetarian'";
        }
        return foodPrice;
    }

    public String bevPriceCalc() {
        if (this.bev == "soda") {
            bevPrice = "50";
        } else if (this.bev == "beer and wine") {
            bevPrice = "200";
        } else if (this.bev == "open bar") {
            bevPrice = "1000";
        } else {
            return "Please enter 'soda', 'beer and wine' or 'open bar'";
        }
        return bevPrice;
    }

    public String entPriceCalc() {
        if (this.ent == "none") {
            entPrice = "0";
        } else if (this.ent == "DJ") {
            ent = "500";
        } else if (this.ent == "live band") {
            entPrice = "1000";
        } else {
            return "Please enter 'live band', 'DJ' or 'none'";
        }
        return entPrice;
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

}