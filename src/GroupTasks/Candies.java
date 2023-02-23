package GroupTasks;

import java.util.Arrays;

public class Candies {

    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        boolean[] result = new boolean[5];

        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= 5) {
                result[i] = true;
            } else result[i] = false;
        }
        System.out.println(Arrays.toString(result));
    }
}
