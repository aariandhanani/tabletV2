package com.suarez;

import java.util.Random;
import java.util.Scanner;
/*
Aarian Dhanani
2/18/19
Where the rock paper scissors game can be played through other apps.
*/

public class rockpaperscissors {
    public static void runrockpaperscissors(){
        //set up for easy exit out of class later
        int runpaper = 1;
        while(runpaper == 1)
        {
            //the computer generates a random number which symbolizes rock, paper, or scissors
            Random rand = new Random();
            int compchoice = rand.nextInt(3)+1;

//            System.out.println(compchoice); Testing purposes only

            //the user inputs a number which symbolizes rock, paper, or scissors
            System.out.println("Choose: \n[1]rock\n[2]paper\n[3]scissors");
            Scanner scan = new Scanner(System.in);
            int playerchoice = scan.nextInt();

            //depending on the user's choice and the computer's choice, it prints a statement
            switch (playerchoice){
                case 1:
                    if (compchoice == 1)
                    {
                        System.out.println("It is a tie!");
                    }
                    if (compchoice == 2)
                    {
                        System.out.println("You lose!");
                    }
                    if (compchoice ==3)
                    {
                        System.out.println("You win!");
                    }
                    break;
                case 2:
                    if (compchoice == 2)
                    {
                        System.out.println("It is a tie!");
                    }
                    if (compchoice == 3)
                    {
                        System.out.println("You lose!");
                    }
                    if (compchoice ==1)
                    {
                        System.out.println("You win!");
                    }
                    break;
                case 3:
                    if (compchoice == 3)
                    {
                        System.out.println("It is a tie!");
                    }
                    if (compchoice == 1)
                    {
                        System.out.println("You lose!");
                    }
                    if (compchoice ==2)
                    {
                        System.out.println("You win!");
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
            }

            //checks if the user would like to play again
            System.out.println("Would you like to play again?\n[1]yes\n[2]no");
            int playagain = scan.nextInt();

            switch (playagain){
                case 1:
                    break;
                case 2:
                    System.out.println("You will now return to the main menu");
                    runpaper--;
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}
