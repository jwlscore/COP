/*---------------------------------------------------
Name: Juliette Perez
Student ID: 4000366015
COP 2800 – Java Programming
Spring 2025 – Th 5:30 PM – 8:50 PM
Assignment #2
Plagiarism Statement
I certify that this assignment is my own work and that I have not
copied in part or whole or otherwise plagiarized the work of other
students, persons, Generative Pre-trained Generators (GPTs) or any other AI tools.
I understand that students involved in academic dishonesty will face
disciplinary sanctions in accordance with the College's Student Rights
and Responsibilities Handbook (https://www.mdc.edu/rightsandresponsibilities)
01234567890123456789012345678901234567890123456789012345678901234567890123456789
----------------------------------------------------------*/

import java.util.Scanner;

public class SpaceX {

    public static int getMenuOption() {
        Scanner input = new Scanner(System.in);
        int option = 0, errorCount = 0;

            System.out.println("Welcome to SpaceX: Choose Your Adventure:");
            System.out.println("---------------------------------");
            System.out.println("1- Purchase STARSHIP SMs");
            System.out.println("2- Purchase HEAVY FALCON SMs");
            System.out.println("3- Exit Program");

            do {
                option = input.nextInt();

                if (option < 1 || option > 3) {
                    errorCount++;

                    System.out.println("Error " + errorCount + " of 5.");

                    if (errorCount == 5) {
                        option = 3;

                        System.out.println("Too many errors. Exiting the program.");
                        break;
                    }

                    System.out.println("Please enter one of the menu options 1-3."); 
                } 
            }
            
            while(option < 1 || option > 3);

            return option;
        }

    public static void main(String[] args) {

        System.out.println("Hi! Welcome to SpaceX, let us begin!");

        int option;
        Scanner user = new Scanner(System.in);
        int buy = 0;
        double price;

        do {
            option = getMenuOption();

            switch(option) {
                case 1: 

                    System.out.println("How many STARSHIP SMs do you wish to buy?");
                    
                    while (user.hasNext()) {

                        if (user.hasNextInt()) {
                            buy = user.nextInt();
                            if (buy < 1) {
                                System.out.println("Can not be below 1.");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("That is not an integer.");
                        }
                    }

                    if (buy <= 5) {
                        price = buy * 2.5;
                    } else {
                        price = buy * 2.0;
                    }

                    System.out.printf("Thank you for choosing to purchase %d STARSHIP SMs!\nThat will be $%.2f million.\n", buy, price);

                break;

                case 2: 
                
                    System.out.println("How many FALCON HEAVY SMs do you wish to buy?");
                    while (user.hasNext()) {

                        if (user.hasNextInt()) {
                            buy = user.nextInt();
                            if (buy < 1) {
                                System.out.println("Can not be below 1.");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("That is not an integer.");
                        }
                    }

                    if (buy <= 5) {
                        price = buy * 1.5;
                    } else {
                        price = buy * 1.0;
                    }
                    
                    System.out.printf("Thank you for choosing to purchase %d FALCON HEAVY SMs!\nThat will be $%.2f million.\n", buy, price);

                break;

                case 3: 

                    System.out.println("Thank you for visiting!");
                    System.exit(0);
                    
                break;
            }
        } 
        while(option != 3);
    }
}