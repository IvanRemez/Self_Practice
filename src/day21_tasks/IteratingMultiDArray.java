package day21_tasks;

public class IteratingMultiDArray {

    public static void main(String[] args) {

        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        for (String[][][][][][][][][] strings : array) {
            for (String[][][][][][][][] string : strings) {
                for (String[][][][][][][] strings1 : string) {
                    for (String[][][][][][] strings2 : strings1) {
                        for (String[][][][][] strings3 : strings2) {
                            for (String[][][][] strings4 : strings3) {
                                for (String[][][] strings5 : strings4) {
                                    for (String[][] strings6 : strings5) {
                                        for (String[] strings7 : strings6) {
                                            for (String s : strings7) {
                                                System.out.println(s);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
/*
3. Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can display each element of the given array

 */