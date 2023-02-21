package ExtraTasks;

public class JavaTask {

    public static void main(String[] args) {

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        for (int each : arr) {
            if (each % 15 == 0 && each % 3 == 0)
                divisibleBy15 += each + " ";
            if (each % 5 == 0 && each % 15 != 0)
                divisibleBy5 += each + " ";
            if (each % 3 == 0 && each % 15 != 0)
                divisibleBy3 += each + " ";
        }
        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);
    }
}

/*
Numbers - - print consecutive numbers

Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number
divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than
one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this
given order. For example, numbers divisible by both 2 and 3 should be replace by CodilityTest and numbers divisible by all
three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
For example, here is the output for N = 24:

1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
 */