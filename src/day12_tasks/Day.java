package day12_tasks;

public class Day {

    public static void day(int num){

        if (num < 1 || num > 7) {
            System.err.println("Invalid Number");
            return;
        }

        String day = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" :
                (num == 3) ? "Wednesday" : (num == 4) ? "Thursday" :
                (num == 5) ? "Friday" : (num == 6) ? "Saturday" : "Sunday";

        System.out.println(day);
    }

    public static void main(String[] args) {

        day(3);
        day(7);
        day(9);

    }
}
/*
4. Create a method named day that can display the name of the day based on
the given number to the method, if the number is invalid, then the method
should print the error message "Invalid Number"

    Ex:
        day(5)

        output:
            Friday
 */