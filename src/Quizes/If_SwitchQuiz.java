package Quizes;

public class If_SwitchQuiz {

    public static void main(String[] args) {

        int score = 0;

        if (score == 0) {
            score += 50;
        }
        if (score != 0) {
            score += 50;
        }

        System.out.println(score);
        System.out.println("----------------------------");

        char grade = 'A';

        boolean Passed = grade == 'A' || grade == 'B';
        boolean Passed2 = grade == 'C' || grade == 'D';

        if (Passed || Passed2) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        System.out.println("----------------------------");

        boolean A = true,
                B = !false;

        if (B) {
            System.out.println("B");
        } else if (A) {
            System.out.println("A");
        } else {
            System.out.println("C");
        }
        System.out.println("----------------------------");

        /* boolean result = true;

        if (result) {
            System.out.println("it's true");
        }else {
            System.out.println("false");
        }else if(result){
            System.out.println("none");
        }

         */

        System.out.println("----------------------------");

        int num = 10;

        if (--num == 10) {
            System.out.println("num" + num);
        } else {
            System.out.println("dum" + num);
        }
        System.out.println("----------------------------");

        boolean X = true;
        boolean Y = !X == false;
        boolean Z = Y;

        if (X) {
            System.out.println("Hello");
        }
        if (Y) {
            System.out.println("Today");
        }
        if (Z) {
            System.out.println("We");
        }
        System.out.println("----------------------------");

        int num1 = 9;

        if (num1++ == 10) {
            System.out.println("Hello World " + num1);
        } else {
            System.out.println("Hello Universe " + num1);
        }
        System.out.println("----------------------------");

        /*long q = 10;

        switch (q) {
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            case 12:
                System.out.println("Wednesday");
            default:
                System.out.println("Friday");
        }

         */
        System.out.println("----------------------------");

        float f1 = (1_560.00 > 12_60.00) ? 10 : 20;

        System.out.println(f1);

        System.out.println("----------------------------");

        float num3 = (12_345.1 > 123_45.0) ? 12_456 : 124_56.02f;
        float total = num3 + 1024;

        System.out.println(total);
        System.out.println("----------------------------");

        int b = 10;

        switch (b){
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            default:
                System.out.println("Friday");
        }



    }
}
