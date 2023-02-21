package StreamTasks;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Factorial2 {

    public static void main(String[] args) {

/*        int i, fact = 1;
        int n = 5;

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
 */

        System.out.println(factorialUsingStreams(5));

        System.out.println(solutionWithFor(5));

        System.out.println(solutionWithStream(5));

    }

    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (x, y) -> x * y);
    }

    public static int solutionWithFor(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static int solutionWithStream(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

}
/*
Write a method that returns the factorial number of any given number
 */