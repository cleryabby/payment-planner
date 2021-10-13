package com.techelevator;

import java.util.Scanner;


public class PaymentMethodsTracker {
    public static void main(String[] args){


        Scanner userInput = new Scanner(System.in);

        System.out.println("Changing banks? Replacing an expired credit card? With the Payment Methods Tracker " +
                "you can make sure you don't miss a bill.");

    System.out.print("Please enter the payment type (C for credit/debit card, EFT for bank account): ");
    String typeInput = userInput.nextLine().toLowerCase();

    if ("C".toLowerCase().equals(typeInput)) {
        System.out.println("(1) Capital One Credit" +
                "\n(2) Chemical Bank Debit" +
                "\n(3) Visa");
        System.out.print("Please select the number corresponding with the correct credit/debit card: ");
        String numberInput = userInput.nextLine();
        if ("1".equals(numberInput)) {
            System.out.println("Update the following billing methods:" +
                    "\nHealth Insurance Premium" +
                    "\nDonation: EMILY's List" +
                    "\nHBO Subscription");
        } else if ("2".equals(numberInput)) {
            System.out.println("No billing methods to update for this card");
        } else if ("3".equals(numberInput)) {
            System.out.println("Update the following billing methods:" +
                    "\nApple Pay" +
                    "\nDisney+" +
                    "\nDonation: WCMU PBS" +
                    "\nDonation: Act Blue");
        } else {
            System.out.println("Invalid selection");
        }

    } else if ("EFT".toLowerCase().equals(typeInput)) {
        System.out.println("(1) Checking Account" +
                "\n(2) Credit Union Account");
        System.out.print("Please select the number corresponding with the correct account: ");
        String numberInput2 = userInput.nextLine();
        if ("1".equals(numberInput2)) {
            System.out.println("Update the following billing methods:" +
                    "\nDonation: Michigan Public Radio" +
                    "\nCar Insurance Premium" +
                    "\nRenters Insurance Premium");
        } else if ("2".equals(numberInput2)) {
            System.out.println("No billing methods to update for this account");
    } else {
            System.out.println("Invalid selection");
        }
    } else {
        System.out.println("Invalid selection");
    }

}
}