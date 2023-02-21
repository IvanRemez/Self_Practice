package ExtraTasks;

public class InterviewQ2 {

    public static int[] collapse(int[] a) {

        int[] newArr = new int[(a.length + 1) / 2]; //if array has even number of elements, new array will have one one less element, if array has odd number of elements, new array will have one more element


        for (int i = 0, j = 0; i < a.length; i += 2, j++) {
            if (i + 1 < a.length) {
                newArr[j] = a[i] + a[i + 1];
            } else {
                newArr[j] = a[i];
            }
        }

        return newArr;
    }
}
/*
/. Write a program that collapses a list of integers by replacing each successive pair of integers with the sum of the pair.
For example, if a variable called list stores this sequence of values:
[7, 2, 8, 9, 4, 13, 7, 1, 9, 10]The first pair should be collapsed into 9 (7 + 2), the second pair should be collapsed
into 17 (8 + 9), the third pair should be collapsed into 17 (4 + 13) and so on to yield:
[9, 17, 17, 8, 19]If the list stores an odd number of elements, the final element is not collapsed.
For example, the sequence:        [1, 2, 3, 4, 5]would collapse into:        [3, 7, 5]/
 */