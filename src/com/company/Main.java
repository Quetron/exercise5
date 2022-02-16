package com.company;

import java.util.Scanner;

public class Main {
    static int menuChoice;
    static Scanner input = new Scanner(System.in);
    static void menu(){
        try{
            System.out.println("What would you like to do?: " +
                    "\n1) Add new people" +
                    "\n2) Find a persons email" +
                    "\n3) Quit the program");
            menuChoice = input.nextInt();
            switch(menuChoice){
                case 1:
                    AddressBook.addNewPeople();
                    break;
                case 2:
                    AddressBook.findEmail();
                    break;
                case 3:
                    System.exit(0);
            }
        }catch(Exception E){
            System.out.println("Not a valid input, please enter 1 or 2");
        }
    }
    public static void main(String[] args) {
        menu();
    }

}
