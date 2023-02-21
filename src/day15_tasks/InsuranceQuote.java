package day15_tasks;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your gender");
        String gender = input.nextLine().toLowerCase();

        while (!(gender.equals("male") || gender.equals("female"))){
            System.err.println("Invalid entry. Please re-enter your gender");
            gender = input.nextLine().toLowerCase();
        }

        System.out.println("Are you married? Yes/No");
        String isMarried = input.nextLine().toLowerCase();

        while (!(isMarried.equals("yes") || isMarried.equals("no"))){
            System.err.println("Invalid entry. Please re-enter");
            isMarried = input.nextLine().toLowerCase();
        }

        System.out.println("Enter your age");
        int age = input.nextInt();

        while (!(age > 0 && age < 120)){
            System.err.println("Invalid entry. Please re-enter");
            age = input.nextInt();
        }

        System.out.println("How many miles do you drive a day?");
        int miles = input.nextInt();

        while (miles < 5){
            System.err.println("Invalid entry. Please re-enter");
            miles = input.nextInt();
        }
        input.nextLine();
        System.out.println("Would you prefer full coverage or liability insurance? (full/liability)");
        String insuranceType = input.nextLine().toLowerCase();

        while (!(insuranceType.equals("full") || insuranceType.equals("liability"))){
            System.err.println("Invalid entry. Please re-enter");
            insuranceType = input.nextLine().toLowerCase();
        }

        System.out.println("Have you had any accidents or claims in the past 5 years? (Yes/No)");
        String claims = input.nextLine().toLowerCase();

        while (!(claims.equals("yes") || claims.equals("no"))){
            System.err.println("Invalid entry. Please re-enter");
            claims = input.nextLine().toLowerCase();
        }

        System.out.println("Does your car have an anti-theft device? (Yes/No)");
        String antiTheft = input.nextLine().toLowerCase();

        while (!(antiTheft.equals("yes") || antiTheft.equals("no"))){
            System.err.println("Invalid entry. Please re-enter");
            antiTheft = input.nextLine().toLowerCase();
        }

        input.close();

        double price = 0;

        if (insuranceType.equals("liability")){
            if (age < 25){
                price += 90;
            }else {
                price += 50;
            }
            if (miles > 50){
                price += 50;
            } else if (miles <= 10) {
                price += 10;
            }else {
                price += 30;
            }
        }else {             // full coverage
            if (age < 25){
                price += 160;
            }else {
                price += 120;
            }
            if (miles > 50){
                price += 70;
            } else if (miles <= 10) {
                price += 20;
            }else {
                price += 40;
            }
        }
        if (antiTheft.equals("yes")){
            price *= 0.95;
        }
        if (claims.equals("yes")){
            price *= 1.15;
        }
        if (claims.equals("no")){
            price *= 0.90;
        }
        if (isMarried.equals("yes")){
            price *= 0.95;
        }

        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("Married = " + isMarried);
        System.out.println("age = " + age);
        System.out.println("miles driven a day = " + miles);
        System.out.println("insuranceType = " + insuranceType);
        System.out.println("claims = " + claims);
        System.out.println("antiTheft device = " + antiTheft);
        System.out.println("Total price = " + price);

    }
}
/*
10. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?

				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount
 */