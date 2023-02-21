package day12_tasks;

public class MonthName {

    public static void monthName(int month) {

        if (month < 1 || month > 12) {
            System.err.println("Invalid Number");
            return;
        }

        String monthNum = (month == 1) ? "January" : (month == 2) ? "February" :
                (month == 3) ? "March" : (month == 4) ? "April" :
                (month == 5) ? "May" : (month == 6) ? "June" :
                (month == 7) ? "July" : (month == 8) ? "August" :
                (month == 9) ? "September" : (month == 10) ? "October" :
                (month == 11) ? "November" : "December";

        System.out.println(monthNum);
    }

    public static void main(String[] args) {

        monthName(3);
        monthName(13);

    }
}
/*
3. Create a method named monthName that can display the name of the month based on
the given number to the method, if the number is invalid, then the method should
print the error message "Invalid Number"

    Ex:
        monthName(6)

        output:
            June
 */