package day15_tasks;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "Cydeo";
        String password = "Cydeo123";
        System.out.println("Enter username:");
        String enteredUsername = input.next();
        System.out.println("Enter password:");
        String enteredPassword = input.next();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)){
            System.out.println("Logged in");    // if credentials are correct
        }else {     // otherwise

            for (int i = 1; i <= 3 ; i++) {

                System.err.println("Incorrect username or password. Try again.");

                System.out.println("Enter username:");
                enteredUsername = input.next();

                System.out.println("Enter password:");
                enteredPassword = input.next();

                if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
                    System.out.println("Logged in");  // if credentials are correct
                    break;      // exits the loop
                }
            }
        }
        if( ! (enteredUsername.equals("Cydeo") && enteredPassword.equals("Cydeo123") ) ){

            // after all three attempts, if the username & password are still incorrect

            System.err.println("Your account now is locked, please contact the support team");
        }

    }

}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that
your credentials are:

                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user
                to have three attempts to enter correct credentials and if all three
                attempts are failed, then print "Your account is locked."
 */