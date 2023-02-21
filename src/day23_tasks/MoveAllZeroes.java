package day23_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveAllZeroes {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);

        int countZeroes = Collections.frequency(list, 0);
        // use Collections frequency method to count 0s
        // need to know because ArrayList size will change once 0s are removed

        list.removeAll(Arrays.asList(0)); // remove all 0s
        System.out.println(list);

        for (int i = 0; i < countZeroes; i++) {
            // fori loop used to add 0s back at the end
            // iteration count = # of 0s removed = # of add operations performed
                                                            // = # of 0s added back in

            list.add(0);
        }
        System.out.println(list);

    }
}
/*
6. Write a program that can move all the zeros to the last indexes of ArrayList

            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */