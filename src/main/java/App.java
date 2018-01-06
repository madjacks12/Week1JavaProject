import models.Event;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        boolean programRunning = true;

        Scanner keyboard = new Scanner(System.in);

        while (programRunning) {

            System.out.println("Hello! Let's estimate the cost of your next event!");
            System.out.println("How many guests will be attending your event?");
            String guestString=keyboard.next();
            int guests = Integer.parseInt(guestString);
            System.out.print("What meal would you like served? pick 'chicken', 'steak' or 'vegetarian'");
            String food = keyboard.next();
            System.out.print("Which beverages would you like served? pick 'soda', 'beer and wine' or 'open bar'");
            String bev = keyboard.next();
            System.out.print("Pick what type of entertainment you would like at your event? pick 'DJ', 'live band' or 'none'");
            String ent = keyboard.next();
            Event newEvent = new Event(guests, food, bev, ent);

            int guestPrice = newEvent.guestPriceCalc(); //this works
            String foodPriceString = newEvent.foodPriceCalc(); //nothing below here does
            //String bevPriceString = newEvent.bevPriceCalc();
           // System.out.print(bevPriceString);
            //String entPriceString = newEvent.entPriceCalc();
           //int foodPrice = Integer.parseInt(foodPriceString);
            //System.out.print(foodPrice);
           // int bevPrice = Integer.parseInt(bevPriceString);
           // int entPrice = Integer.parseInt(entPriceString);
            //System.out.print("Your total is: " + (guestPrice+foodPrice + bevPrice + entPrice));

        }
    }
}


