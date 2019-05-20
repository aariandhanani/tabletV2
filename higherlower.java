package com.suarez;
/*
Aarian Dhanani
2/18/19
Mini game where the user has to guess a random number
*/

import java.util.Random;
import java.util.Scanner;

public class higherlower {
    public static void mainhigherlower()
    {
        write();
    }

    //computer generates a random number
    public static void write(){
        Random rand = new Random();
        int number = rand.nextInt(10)+1;
        check(number); //goes into the main part of the code
    }

    //main part of code where user interacts
    public static void check(int num1) {
        //sets number of tries
        System.out.println("How many tries would you like to play with?");
        int guesses = 0;

        Scanner guess = new Scanner(System.in);
        guesses = guess.nextInt();
        int scans = 0;
        System.out.println("Please guess a number between 1 and 10");
        while (scans != num1 && guesses > 0) //user continues guessing until they are out of tries
        {
            System.out.println("Give it a guess!");
            Scanner scan = new Scanner(System.in);
            scans = scan.nextInt();
            if (scans != num1) {
                if (Math.abs(num1 - scans) > 3) //gives user a hint on how far they are from the correct number
                {
                    System.out.println("You were off by a mile!");
                    guesses = guesses -1;
                }
                else{
                    System.out.println("You were so close!");
                    guesses = guesses -1;
                }
            }
        }
        if (guesses > 0){
            System.out.println("You WIN, Congrats! You will now return to the main menu.");
        }
        else{
            System.out.println("Sorry, you are out of lives and lose! You will now return to the main menu");
        }
    }
}
