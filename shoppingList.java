package com.suarez;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class shoppingList
{
    //object class for the shopping list


    public static String shoppingwords;
    private String item;
    private int price;
    public static ArrayList<shoppingList> shopList;
    int again = 1;

    public void initialize( )
    {
        shopList = new ArrayList<shoppingList>( );
    }

    public shoppingList()
    {
        item = "unkown";
    }

    public shoppingList(String item1) {
        item = item1;
    }

    public shoppingList(String item1, int price) {
        item = item1;
        SetPrice(price);
    }

    public shoppingList SetPrice(int price)
    {
        if (price < 0)
        {
            this.price = 0;
        }
        else
        {
            this.price = price;
        }
        return this;
    }

    public String Getitem()
    {
        return item;
    }

    public int Getprice()
    {
        return price;
    }

    public String toString(String item, int price)
    {
        shoppingwords = "Item: " + item + "\nPrice: " + price;
        return shoppingwords;
    }

    //due to how the tablet functions, it was much easier to include what would be the "client" after the object class
    public void fillWithList( )
    {
        initialize();
        again = 1;
        int continueIt = 1;
        while (again == 1)
        {
            String yesorno1= JOptionPane.showInputDialog("What would you like to do?\n[1]add an item \n[2]view list\n[3]save items\n[4]return to menu");
            int yesorno = Integer.parseInt(yesorno1);
            switch (yesorno)
            {
                case 1:
                    while(continueIt == 1)
                    {
                        String JoptionItem = JOptionPane.showInputDialog("Please enter the item name: ");
                        String name1 = JoptionItem;
                        String number= JOptionPane.showInputDialog("Please enter the price (to the nearest whole number)");
                        int num = Integer.parseInt(number);
//                        shoppingList item1 = new shoppingList( "" + name1, 0 + num);
//                        shopList.add(item1);
//                        JOptionPane.showMessageDialog(null, "Item saved!");



                        shoppingList shop;
                        shop = new shoppingList(name1, num);
                        shopList.add(shop);
//                        System.out.println("New contact added: ");
//                        contact.displayContact();
                        String display = "New item added: " + shop.shoppingListSheetWords();

                        JOptionPane.showMessageDialog(null, display);




                        String continue2 = JOptionPane.showInputDialog("Would you like to add another item?\n[1]yes\n[2]no ");
                        int yesorno10 = Integer.parseInt(continue2);
                        switch (yesorno10)
                        {
                            case 1:
                                break;
                            case 2:
                                continueIt = 0;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid input!");
                        }
                    }
                    break;
                case 2:
                    try
                    {
                        Scanner inputContacts = new Scanner(new File("/Users/aariandhanani/IdeaProjects/Java2finalproject/src/shoppinglist"));

                        String showContacts = "";

                        String temporary = "";
                        String space = "";
                        while ( inputContacts.hasNext())
                        {
                            temporary = inputContacts.nextLine();
                            if (temporary.startsWith("Email Address:"))
                            {
                                space = "\n";
                            }
                            showContacts = showContacts + temporary + "\n" + space;
                            temporary = "";
                            space = "";
                        }

                        inputContacts.close();

                        JOptionPane.showMessageDialog(null, "Here is your shopping list: \n" + showContacts);

                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace( );
                    }
                    break;
                case 3:
                    exportList();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "You will now return to the main menu!");
                    again = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input!");


            }
        }
    }
    public static void exportList()
    {
        try
        {
            File shoppingSheet = new File("/Users/aariandhanani/IdeaProjects/Java2finalproject/src/shoppinglist");
            FileWriter shoppingfile = new FileWriter(shoppingSheet, true);
            for ( shoppingList x: shopList){
                shoppingfile.write(x.shoppingListSheetWords());
            }
            shoppingfile.close();
            JOptionPane.showMessageDialog(null, "Items added!");

            shopList.clear(); //clears the arraylist so that the same items cannot be exported again on accident

        }
        catch (IOException ioe)
        {
            System.out.println("There are no items!");
        }
    }

    public String shoppingListSheetWords()
    {
        return ("\nItem: " + item + "\nPrice: " + price);
    }

}
