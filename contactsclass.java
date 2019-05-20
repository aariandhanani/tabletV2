package com.suarez;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import java.io.*;
import java.io.FileNotFoundException;


/*
Aarian Dhanani
2/18/19
This is the main for the contacts. This is where the user interacts and can add contacts as well as view contacts.
*/

//adapted from https://stackoverflow.com/questions/21664677/creating-a-contact-list-with-java-and-object-oriented

public class contactsclass
{
    public static ArrayList<Contact> contacts = new ArrayList<Contact>();


    public static void maincontacts()  {

        int contactson = 1;

        while (contactson == 1)
        {
            int adding = 0; //to add a new contact to the ArrayList


            //main area
            String opencontacts= JOptionPane.showInputDialog("What would you like to do?\n[1]View Saved Contacts \n[2]Add Contacts\n[3]Save all new contacts\n[4]Return to the Main Menu");
            int contactsoption = Integer.parseInt(opencontacts);

            switch (contactsoption){
                case 1:
                    //view contacts: in this new version of the tablet, you can actually look at contacts that have been exported!
                    try
                    {
                        Scanner inputContacts = new Scanner(new File("/Users/aariandhanani/IdeaProjects/Java2finalproject/contactsheet.txt"));

//                        ArrayList<String> contactslist2 = new ArrayList<String>();
//                        while (inputContacts.hasNext())
//                        {
//                            contactslist2.add(inputContacts.next());
//                        }
//                        inputContacts.close();

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

                        JOptionPane.showMessageDialog(null, "Here are your registered contacts: \n" + showContacts);

                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace( );
                    }
                    break;
                case 2:
                    //input contacts
                    String yesorno1= JOptionPane.showInputDialog("Would you like to enter a new contact?\n[1]yes\n[2]no");
                    int yesorno = Integer.parseInt(yesorno1);
                    switch (yesorno) {
                        case 1:
                            adding = 1;
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "You will now return to the menu!");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Invalid input!");
                    }
                    while (adding == 1) //if said yes to add a new contact
                    {

                        //Takes in name and email

                        String passwordJoptionname= JOptionPane.showInputDialog("Please enter the first name: ");
                        String name1 = passwordJoptionname;
                        String passwordJoptionemail= JOptionPane.showInputDialog("Please enter the email address: ");
                        String email1 = passwordJoptionemail;

                        Contact contact;
                        contact = new completeContact(name1, email1);
                        contacts.add(contact);
//                        System.out.println("New contact added: ");
//                        contact.displayContact();
                        String display = "New contact added: " + contact.displayContact2();

                        JOptionPane.showMessageDialog(null, display);


                        String yesorno2= JOptionPane.showInputDialog("Would you like to enter another contact?\n[1]yes\n[2]no");
                        int yesornocheck = Integer.parseInt(yesorno2);
                        switch (yesornocheck)
                        {
                            case 1:
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "You will now return to the contacts menu.");
                                adding = 0;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid input!");
                        }
                    }
                    break;
                case 3:
                    exportcontact();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "You will now return to the main menu!");
                    contactson = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input!");
            }
        }

    }
    public static void exportcontact() {
        try
        {
            File contactsheet = new File("contactsheet.txt");
            FileWriter contactfile = new FileWriter(contactsheet, true);
            for ( Contact x: contacts){
                contactfile.write(x.contactlistsheet());
            }
            contactfile.close();
            JOptionPane.showMessageDialog(null, "Contacts Exported");


            contacts.clear(); //clears the arraylist so that the same contacts cannot be exported again on accident

        }
        catch (IOException ioe)
        {
            System.out.println("There are no contacts!");
        }
    }
}



