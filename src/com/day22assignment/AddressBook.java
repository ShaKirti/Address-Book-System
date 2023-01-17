package com.day22assignment;

import java.util.Scanner;

/**
 * @author Shashank
 */
public class AddressBook {
    Scanner sc = new Scanner(System.in);
    /*
       Created Contacts Object for Getter and Setter Methods
        */
    Contacts contacts = new Contacts();

    /**
     * Method to Add Contact to AddressBook
     */
    void addContact() {
        System.out.println("Enter First Name : ");
        contacts.setFirstName(sc.nextLine());

        System.out.println("Enter Last Name : ");
        contacts.setLastName(sc.nextLine());

        System.out.println("Enter Address : ");
        contacts.setAddress(sc.nextLine());

        System.out.println("Enter City Name : ");
        contacts.setCity(sc.nextLine());

        System.out.println("Enter State Name : ");
        contacts.setState(sc.nextLine());

        System.out.println("Enter Zip Code : ");
        contacts.setZip(sc.nextLine());

        System.out.println("Enter Phone Number : ");
        contacts.setPhoneNumber(sc.nextLine());

        System.out.println("Enter Email Id : ");
        contacts.setEmailAddress(sc.nextLine());

        System.out.println(contacts);
    }

    /**
     * Method to update existent contact
     * 1) we are taking phone number input from the user to check that the contact is present in the address book or not
     * 2) If present then update the details of that contact
     * 3) If not present then show Contact is not in address book
     */
    void updateContact() {
        System.out.println("Enter Phone Number Of A Person To Edit :  ");
        String editByPhoneNumber = sc.nextLine();
        if (contacts.getPhoneNumber().equals(editByPhoneNumber)) {
            addContact();
        } else {
            System.out.println("Please Enter Valid Phone Number!");
            updateContact();
        }
    }

    /**
     * method to delete the contact from the address book
     * 1) taking mobile number of the person to delete the contact
     * 2) if condition is true then the contact will be deleted,
     * 3) otherwise again ask for valid mobile number
     */
    void deleteContact() {
        System.out.println("Enter Phone Number Of A Person To Delete : ");
        String deleteByPhoneNumber = sc.nextLine();
        /*
        2) if condition is true then the contact will be deleted
         */
        if (contacts.getPhoneNumber().equals(deleteByPhoneNumber)) {
            contacts = null;
            System.out.println(contacts);
            System.out.println("Details Deleted Successfully.");
        }
        /*
        3) otherwise again ask for valid mobile number
         */
        else {
            System.out.println("Please Enter Valid Phone Number!");
            deleteContact();
        }
    }
}