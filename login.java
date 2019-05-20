package com.suarez;
import javax.swing.*;
import java.util.*;
/*
Aarian Dhanani
2/18/19
This is ran when the user firsts opens the "tablet". Allows the user to choose their integer password
*/

public class login {

    //declared as public static so that it can be changed in settings
    public static int password;

    public static void password() {
        int check = 0;
        int chances = 3;
        //Password registration
//        System.out.println("Please enter your new password as an integer value");

        String passwordJoption1= JOptionPane.showInputDialog("Please enter your new password as an integer value");

        int temporaryJoption1 = Integer.parseInt(passwordJoption1);

//        Scanner pass = new Scanner(System.in);
//        password = pass.nextInt();

        password = temporaryJoption1;

        //login again to ensure they remember it
//        System.out.println("Please log in again");


        String passwordJoption2 = JOptionPane.showInputDialog("Please log in again");

        int temporaryJoption2 = Integer.parseInt(passwordJoption2);



//        Scanner guess = new Scanner(System.in);
//        int guesses = pass.nextInt();

        int guesses = temporaryJoption2;

        while (password != guesses) {
            //user has 4 chances to get the password correct or else it exits the entire program
            while (check == 0)
            {
                if (chances != 0)
                {
                    chances--;
                    System.out.println("Incorrect password. You have " + (chances + 1) + " chances remaining!");
                }
                else
                {
                    System.out.println("Password entry failure. Your device will now reset");
                    System.exit(5);
                }

                String passwordJoption3 = JOptionPane.showInputDialog("Please enter: ");

                int temporaryJoption3 = Integer.parseInt(passwordJoption3);

                guesses = temporaryJoption3;

//                guess = new Scanner(System.in);
//                guesses = pass.nextInt();
                if (password == guesses) //if password is correct
                {
                    System.out.println("Welcome");
                    check++;
                }
            }
        }
    }
}
