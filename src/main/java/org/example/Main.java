package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computerChoice= 0;
        int option;

        do {
            System.out.println("1: Start");
            System.out.println("2: Exit");

            option = scanner.nextInt();
            if (option == 1) {
                userInput(computerChoice);
            } else if (option == 2) {
                break;
            }
        } while (option == 1);
    }


    public static void userInput(int computerChoice) {
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;
        Random random = new Random();
        String userSelectedOption;
        do {
            System.out.println("Rock(0), Paper(1) or Scissors(2):");
            computerChoice = random.nextInt(3);
            userSelectedOption = scanner.next().toUpperCase();

            char userInput = userSelectedOption.charAt(0);
             switch (userInput){
                 case 'R': userChoice =0 ;
                 break;
                 case 'P': userChoice = 1;
                 break;
                 case 'S': userChoice = 2;
                 break;
                 default:
                     System.out.println("Please select from the options");
                     return;
             }
            if (userChoice == computerChoice) {
                System.out.println("Its a draw.");
            } else if (userChoice == 0 && computerChoice == 1) {
                System.out.println("Computer wins.");
            } else if (userChoice == 0 && computerChoice == 2) {
                System.out.println("You win.");
            } else if (userChoice == 1 && computerChoice == 0) {
                System.out.println("You win.");
            } else if (userChoice == 1 && computerChoice == 2) {
                System.out.println("Computer wins.");
            } else if (userChoice == 2 && computerChoice == 0) {
                System.out.println("Computer wins.");
            } else if (userChoice == 2 && computerChoice == 1) {
                System.out.println("Computer wins.");
            } else {
                System.out.println("You have entered the wrong number");
            }
        } while (userChoice >= 0 && userChoice < 3);
    }
}