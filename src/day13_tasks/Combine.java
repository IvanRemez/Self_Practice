package day13_tasks;

public class Combine {

    public static String combine(String w1, String w2){

        char end1 = w1.charAt(w1.length() - 1),
                start2 = w2.charAt(0);

        if (end1 == start2){
            return w1 + w2.substring(1);
        }else {
            return w1 + " " + w2;
        }

    }

    public static void main(String[] args) {

        System.out.println(combine("one", "iight"));

    }
}
/*
5.  Create a method named combine that can take two strings and then add them together
and returns it.
        But if the last letter of the first word and the first letter of the last
        letter are the same, return that character once.

    Ex:
        combine("one", "eight")  ==> oneight
 */