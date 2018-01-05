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

//        System.out.println("Hello! Let's estimate the cost of your next event!");
//        System.out.println("How many guests will be attending your event?");

        Scanner keyboard = new Scanner(System.in);

        while (programRunning) {

            System.out.println("Hello! Let's estimate the cost of your next event!");
            System.out.println("How many guests will be attending your event?");
            String guestsString = keyboard.nextLine();
            int guests = Integer.parseInt(guestsString);
            System.out.print("What meal would you like served? pick 'chicken', 'steak' or 'vegetarian'");
            String food = keyboard.nextLine();
            System.out.print("Which beverages would you like served? pick 'soda', 'beer and wine' or 'open bar'");
            String bev = keyboard.nextLine();
            System.out.print("Pick what type of entertainment you would like at your event? pick 'DJ', 'live band' or 'none'");
            String ent = keyboard.nextLine();

            //int number = keyboard.nextint();  // another local variable
            //keyboard.nextLine();  // to handle the end of line characters
            Event newEvent = new Event(guests, food, bev, ent);
            newEvent.foodPriceCalc();
            newEvent.bevPriceCalc();
        }
    }

}


