package com.suarez;
/*
Aarian Dhanani
2/18/19
Sets up string values for name and email for the contacts so that it can easily be called in the main contacts class
*/

public abstract class Contact
{
    private String name;
    private String email;


    public Contact()
    {
        this.name = "NoOne";
        this.email = "NoOne@noOne.com";
    }


    public Contact(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    //sets the name
    public void setName(String input)
    {
        this.name = input;
    }

    public String getName()
    {
        return name;
    }

    public void setemail(String input)
    {
        this.email = input;
    }

    public String getemail()
    {
        return email;
    }

    void displayContact()
    {
        System.out.println("\nName: " + name + "\nEmail Address: " + email);
    }

    public String displayContact2()
    {
        String words = "\nName: " + name + "\nEmail Address: " + email;
        return words;
    }

    public String contactlistsheet()
    {
        return ("\nName: " + name + "\nEmail Address: " + email);
    }

}
