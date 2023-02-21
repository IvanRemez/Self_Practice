package day09_tasks;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many total shares do you own?");
        int shares = input.nextInt();
        if (shares <= 0){
            input.close();
        }

        System.out.println("What is your total value in the stock market?");
        double value = input.nextDouble();
        int value1 = (int) value;

        input.nextLine();
        System.out.println("What is the name of the company in which you own the most shares?");
        String company = input.nextLine();

        System.out.println("Your total stock market holding is $" + value1 +
                " which is made up of " + shares + " shares. " + company + " is your company holdings.");


        input.close();
    }
}
/*
8. Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest
            condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares
        in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100
            shares. Apple INC is your company holdings"
 */