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
            String guests = keyboard.nextLine();
            System.out.print("What meal would you like served? pick 'chicken' 'steak' or 'vegetarian?'");
            String food = keyboard.nextLine();
            System.out.print("Which beverages would you like served? ");
            //int number = keyboard.nextint();  // another local variable
            //keyboard.nextLine();  // to handle the end of line characters

            Event newEvent = Event(guests,)
        }
    }

}


