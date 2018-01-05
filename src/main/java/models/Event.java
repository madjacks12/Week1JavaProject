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


    public int guestPriceCalc() {
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

    public String foodPriceCalc() {
        if (this.food == "chicken") {
            this.foodPrice = "150";
        } else if (this.food=="steak") {
            this.foodPrice = "200";
        } else if (this.food == "vegetarian") {
            this.foodPrice = "100";
        } else {
            return "Please enter 'chicken', 'steak' or 'vegetarian'";
        } return this.foodPrice;
    }

    public String bevPriceCalc() {
        if (this.bev == "soda") {
            this.bevPrice = "50";
        } else if (this.bev=="beer and wine") {
            this.bevPrice = "200";
        } else if (this.bev == "open bar") {
            this.bevPrice = "1000";
        } else {
            return "Please enter 'soda', 'beer and wine' or 'open bar'";
        } return this.bevPrice;
    }

    public String entPriceCalc() {
        if (this.ent == "none") {
            this.entPrice = "0";
        } else if (this.ent=="DJ") {
            this.ent = "500";
        } else if (this.ent == "live band") {
            this.entPrice = "1000";
        } else {
            return "Please enter 'live band', 'DJ' or 'none'";
        } return this.entPrice;
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