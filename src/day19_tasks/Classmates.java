package day19_tasks;

public class Classmates {

    public static void main(String[] args) {

        String[] classmates = {"John Smith", "John Denver", "Josh Adams", "John Adams", "Billy Joel"};

        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ") + 1);
            System.out.println(initial);
        }
    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */