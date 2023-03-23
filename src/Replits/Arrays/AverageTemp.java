package Replits.Arrays;

import java.util.Scanner;

public class AverageTemp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};

        double tempSum = 0.0;

        for (double temp : temps) {
            tempSum += temp;
        }
        System.out.println(tempSum / temps.length);

    }
}
