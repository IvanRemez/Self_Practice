package day09_tasks;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your current speed: ");
        int speedLimit = 55;
        int speed = input.nextInt();

        if (speed > speedLimit){
            System.out.println("Slow down!");
        }
        input.close();
    }
}
/*
4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the
	speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!
 */