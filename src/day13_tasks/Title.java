package day13_tasks;

public class Title {

    public static String title(String word){

        String start = word.substring(0, 1).toUpperCase();
        String rest = word.substring(1).toLowerCase();

        return start + rest;

    }

    public static void main(String[] args) {

        System.out.println(title("jAvA"));

    }
}
/*
7. Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java

 */