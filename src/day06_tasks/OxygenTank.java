package day06_tasks;

public class OxygenTank {

    public static void main(String[] args) {

        int number = 93;
        String result = "";

        if (number > 90){
            result = "Your tank is full";
        }
        if (number > 80 && number <= 90){
            result = "Still okay";
        }
        if (number > 70 && number <= 80){
            result = "Don't go too far";
        }
        if (number > 60 && number <= 70){
            result = "Start to head back";
        }
        if (number > 50 && number <= 60){
            result = "Be careful now you are at 50%";
        }

        System.out.println(result);

    }
}

/*
8. Create a class named OxygenTank. You are diving in the ocean.
Your oxygen tank has a certain level (number) and you must print
a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */