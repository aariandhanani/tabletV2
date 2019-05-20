package com.suarez;
/*
Aarian Dhanani
2/18/19
Install 3rd party apps for the tablet
*/


import javax.swing.*;
import java.util.Scanner;

public class appstore {
    public static void appinstall() {
        //Calling the values of the 2 games
        int openedentry = 0;
        enabledDisabled games = new enabledDisabled();
        int game1 = games.higherlower;
        int game2 = games.rockpaperscissors;

        //Always opens this. Shows which apps are not installed
        JOptionPane.showMessageDialog(null, "Here is a list of 3rd party apps ready to install:");

//        System.out.println("Here is a list of 3rd party apps ready to install:");
        if (game1 == 0) {
            JOptionPane.showMessageDialog(null, "Number Guessing Game");
//            System.out.println("Number Guessing Game");
            openedentry = 1;
        }
        if (game2 == 0) {
            JOptionPane.showMessageDialog(null, "Rock Paper Scissors");

//            System.out.println("Rock Paper Scissors");
            openedentry = 1;
        }
        if (game1 == 1 && game2 == 1) {
            JOptionPane.showMessageDialog(null, "All 3rd party apps are installed. You will now return to the main menu");
            //this is for if a game has not installed
//            System.out.println("All 3rd party apps are installed. You will now return to the main menu");
        }

        //This part only shows if there is a game that has not been installed
        if (openedentry == 1)
        {
            String yesorno= JOptionPane.showInputDialog("Would you like to install a game?\n[1]yes\n[2]no");
            int install = Integer.parseInt(yesorno);
//            System.out.println("Would you like to install a game?\n[1]yes\n[2]no"); //Checks to make sure the user wants to install a game
//            Scanner installorno = new Scanner(System.in);
//            int install = installorno.nextInt();
            switch (install) {
                case 1:
                    if (game1 == 0 && game2 ==0)
                    {
                        //Allows you to choose from both
                        String yesorno1= JOptionPane.showInputDialog("Which would you like to install?\n[1]Number Guessing Game\n[2]Rock Paper Scissors\n[3]Cancel");
                        int install1 = Integer.parseInt(yesorno1);
                        if (install1 == 1)
                        {
                            games.higherlower = 1;
                            JOptionPane.showMessageDialog(null, "Installed. You will now return to the main menu");

                        }
                        else if (install1 == 2)
                        {
                            games.rockpaperscissors = 1;
                            JOptionPane.showMessageDialog(null, "Installed. You will now return to the main menu");

                        }
                        openedentry--;
                    }
                    else if (game1 == 0)
                    {
//                        System.out.println("Would you like to install Number Guessing Game?\n[1]Yes\n[2]No");
//                        int install2 = installorno.nextInt();
                        String yesorno2= JOptionPane.showInputDialog("Would you like to install a game?\n[1]yes\n[2]no");
                        int install2 = Integer.parseInt(yesorno2);
                        if (install2 == 1)
                        {
                            games.higherlower = 1;
                            JOptionPane.showMessageDialog(null, "Installed. You will now return to the main menu");
                        }
                        openedentry--;
                    }
                    else if (game2 == 0)
                    {
                        String yesorno3= JOptionPane.showInputDialog("Would you like to install Rock Paper Scissors?\n[1]Yes\n[2]No");
                        int install3 = Integer.parseInt(yesorno3);
//                        System.out.println("Would you like to install Rock Paper Scissors?\n[1]Yes\n[2]No");
//                        int install3 = installorno.nextInt();
                        if (install3 == 1)
                        {
                            games.rockpaperscissors = 1;
                            JOptionPane.showMessageDialog(null, "Installed. You will now return to the main menu");
                        }
                        openedentry--;
                    }
                    break;
                case 2:
                    //If the user inputs canceled it breaks from the class and returns to the main menu
                    JOptionPane.showMessageDialog(null, "Canceled. You will now return to the main menu.");

//                    System.out.println("Canceled. You will now return to the main menu.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input! You will now return to the main menu.");

//                    System.out.println("Invalid input! You will now return to the main menu.");
            }
        }
    }
}
