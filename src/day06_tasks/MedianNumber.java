package day06_tasks;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;

        int median = (a);

        if (a > b && a > c && b - c > 0) {
            System.out.println(b + " is the median number");
        }
        if (a > b && a > c && c - b > 0) {
            System.out.println(c + " is the median number");
        }

        if (b > a && b > c && a - c > 0) {
            System.out.println(a + " is the median number");
        }
        if (b > a && b > c && c - a > 0) {
            System.out.println(c + " is the median number");
        }

        if (c > a && c > b && b - a > 0) {
            System.out.println(b + " is the median number");
        }
        if (c > a && c > b && a - b > 0) {
            System.out.println(a + " is the median number");
        }
    }
}
/*
Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = input.nextInt();

        System.out.println("Enter second number:");
        int b = input.nextInt();

        System.out.println("Enter third number:");
        int c = input.nextInt();

        if (a > b && a > c && b - c > 0) {
            System.out.println("middle number is: "+b);
        }
        if (a > b && a > c && c - b > 0) {
            System.out.println("middle number is: "+c);
        }

        if (b > a && b > c && a - c > 0) {
            System.out.println("middle number is: "+a);
        }
        if (b > a && b > c && c - a > 0) {
            System.out.println("middle number is: "+c);
        }

        if (c > a && c > b && b - a > 0) {
            System.out.println("middle number is: "+b);
        }
        if (c > a && c > b && a - b > 0) {
            System.out.println("middle number is: "+a);
        }
 */

/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */