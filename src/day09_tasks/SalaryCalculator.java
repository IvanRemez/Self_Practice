package day09_tasks;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate: ");
        int hourlyRate = input.nextInt();

        System.out.println("Enter number of hours worked in a week: ");
        int weeklyHours = input.nextInt(),
                salaryBeforeTax = hourlyRate * weeklyHours * 52;

        System.out.println("Enter state tax (percentage): ");
        double stateTaxRate = input.nextDouble();

        System.out.println("Enter federal tax (percentage): ");
        double federalTaxRate = input.nextDouble();

        double stateTax = salaryBeforeTax * stateTaxRate,
                federalTax = salaryBeforeTax * federalTaxRate,
                totalTax = stateTax + federalTax,
                netIncome = salaryBeforeTax - totalTax;

        System.out.println("salaryBeforeTax = $" + salaryBeforeTax);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("netIncome = $" + netIncome);


        input.close();
    }
}
/*
10. Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */