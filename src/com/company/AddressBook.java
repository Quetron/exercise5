package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    static HashMap<Integer, Person> contactInfoHashMap = new HashMap<Integer, Person>();
    static Scanner input = new Scanner(System.in);
    static Integer counter = 0;
    static Person newPerson;

    public static void addNewPeople(){
        String loop = "y";
        while((loop.equalsIgnoreCase("y"))){
            System.out.println("What is the name if your person?: ");
            String nameOfPerson = input.nextLine();
            System.out.println("What is the Email of this person?: ");
            String emailOfPerson = input.nextLine();
            newPerson = new Person(nameOfPerson, emailOfPerson);
            contactInfoHashMap.put(counter, newPerson);
            counter ++;
            System.out.println("Would you like to add a new person (Y/N): ");
            loop = input.nextLine();
        }
        Main.menu();
    }

    public static void findEmail(){
        System.out.println("What is the name of the person you are trying to get the email of?: ");
        String usrName = input.nextLine();
        for (int i = 0; i < contactInfoHashMap.size(); i++) {

            if(usrName.equals(contactInfoHashMap.get(i).getName()))
                System.out.println(contactInfoHashMap.get(i).getEmailAddress());
        }
        Main.menu();
    }
}
