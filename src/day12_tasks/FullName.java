package day12_tasks;

public class FullName {

    public static void capitalization(String firstName, String lastName){

        String first = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        String last = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(first + " " + last);

    }

    public static void main(String[] args) {

        capitalization("iVan", "reMez");

    }
}
