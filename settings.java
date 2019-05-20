package com.suarez;

import javax.swing.*;
import java.util.Scanner;
/*
Aarian Dhanani
2/18/19
The settings class where preferences can be changed.
*/

public class settings {
    public static void settingsopen() {

        //for easy exit later
        int settingson = 1;

        while (settingson == 1)
        {
            //allows user to choose which option they would like to go to

            String menusettings = JOptionPane.showInputDialog("Welcome to settings. Please enter which option you would like to open: \n[1]delete apps \n[2]change password \n[3]reset \n[4]return to home page");
            int choices = Integer.parseInt(menusettings);
            switch (choices) {

                //allows the user to set the values in enabledDisabled to 0 if it is currently 1
                case 1:
                    JOptionPane.showMessageDialog(null, "Here is a list of your active 3rd party apps: ");

//                    System.out.println("Here is a list of your active 3rd party apps:");
                    enabledDisabled games = new enabledDisabled();
                    int game1 = games.higherlower;
                    int game2 = games.rockpaperscissors;
                    if (game1 == 1) {
                        JOptionPane.showMessageDialog(null, "Number Guessing Game\n");

//                        System.out.println("Number Guessing Game\n");

                        String menuopen = JOptionPane.showInputDialog("Would you like to delete Rock Paper Scissors?\n[1]yes\n[2]no");
                        int delete2 = Integer.parseInt(menuopen);

//                        System.out.println("Would you like to delete Number Guessing Game?\n[1]yes\n[2]no");
//                        Scanner deleteorno = new Scanner(System.in);
//                        int delete = deleteorno.nextInt();

                        switch (delete2) {
                            case 1:
                                System.out.println("Game deleted!");
                                games.higherlower = 0;
                                break;
                            case 2:
                                System.out.println("Canceled");
                                break;
                            default:
                                System.out.println("Invalid input!");

                        }
                    }
                    if (game2 == 1) {
                        JOptionPane.showMessageDialog(null, "Rock Paper Scissors\n");

//                        System.out.println("Rock Paper Scissors\n");
                        String menu50 = JOptionPane.showInputDialog("Would you like to delete Rock Paper Scissors?\n[1]yes\n[2]no");
                        int delete = Integer.parseInt(menu50);
//                        System.out.println("Would you like to delete Rock Paper Scissors?\n[1]yes\n[2]no");
//                        Scanner deleteorno = new Scanner(System.in);
//                        int delete = deleteorno.nextInt();
                        switch (delete) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Game deleted!");

//                                System.out.println("Game deleted!");
                                games.rockpaperscissors = 0;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Canceled");

//                                System.out.println("Canceled");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid input!");

//                                System.out.println("Invalid input!");

                        }
                    }
                    if (game1 != 1 && game2 != 1) {
                        JOptionPane.showMessageDialog(null, "No other apps are enabled! Visit the app store to install.\n");

//                        System.out.println("No other apps are enabled! Visit the app store to install.\n");
                    }
                    break;

                //allows user to change the value of password that was originally set
                case 2:
                    login passwords = new login();
                    int passwordtest = passwords.password;

                    String passwordJoption2 = JOptionPane.showInputDialog("This area is password protected. Please enter your password.");

                    int temporaryJoption2 = Integer.parseInt(passwordJoption2);

                    int check = 0;
                    int chances = 3;
                    int guesses = temporaryJoption2;


                    while (passwordtest != guesses) {
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

                            if (passwordtest == guesses) //if password is correct
                            {
                                System.out.println("Welcome");
                                check++;
                            }
                        }
                    }

                    login first = new login();
                    first.password();

                    System.out.println("Password changed!");
                    break;

                //allows user to reset their device (exits the entire program)
                case 3:
                    login passwords1 = new login();
                    int passwordtest1 = passwords1.password;

                    String passwordJoption21 = JOptionPane.showInputDialog("This area is password protected. Please enter your password.");

                    int temporaryJoption21 = Integer.parseInt(passwordJoption21);

                    int check1 = 0;
                    int chances1 = 3;
                    int guesses1 = temporaryJoption21;


                    while (passwordtest1 != guesses1) {
                        //user has 4 chances to get the password correct or else it exits the entire program
                        while (check1 == 0)
                        {
                            if (chances1 != 0)
                            {
                                chances1--;
                                System.out.println("Incorrect password. You have " + (chances1 + 1) + " chances remaining!");
                            }
                            else
                            {
                                System.out.println("Password entry failure. Your device will now reset");
                                System.exit(5);
                            }

                            String passwordJoption31 = JOptionPane.showInputDialog("Please enter: ");

                            int temporaryJoption31 = Integer.parseInt(passwordJoption31);

                            guesses = temporaryJoption31;

                            if (passwordtest1 == guesses) //if password is correct
                            {
                                System.out.println("System reset starting");
                                check1++;
                                System.exit(10);
                            }
                        }
                    }
                    break;

                //returns the user to the main menu
                case 4:
                    System.out.println("You will now return to the main menu.");
                    settingson = 0;
                    break;

                default: System.out.println("Invalid input!");
            }
        }
    }
}