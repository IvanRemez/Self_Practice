package day16_tasks;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;

        while (true){

            System.out.println("Which room would you like to select?");
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");

            String room = input.nextLine().toLowerCase();

            while (!(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed"))){
                System.err.println("Invalid entry. Please re-enter");
                room = input.nextLine().toLowerCase();
            }   // to make sure user selected one of the valid options

            System.out.println("How many nights are you staying?");
            int nights = input.nextInt();

            while (nights < 1){
                System.err.println("Invalid Entry, please re-enter number of nights");
                nights = input.nextInt();
            }

            total += (room.equals("king bed")) ? (120 * nights) : (room.equals("queen bed")) ? (100 * nights) : (80 * nights);

            input.nextLine();
            System.out.println("Would you like to reserve another room? (Yes/No)");
            String room2 = input.nextLine().toLowerCase();

            while (!(room2.equals("yes") || room2.equals("no"))){
                System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
                room2 = input.nextLine().toLowerCase();
            }
            if (room2.equals("no")){

                System.out.println("Okay. Your total price is $" + total);
                break;
            }
        }

        input.close();
    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

                If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */