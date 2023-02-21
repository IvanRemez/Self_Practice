package day11_tasks;

public class WebsiteAddress {

    public static void main(String[] args) {

        String url = "www.google.com";

        if (url.startsWith("www.") && url.endsWith(".com") || url.endsWith(".edu")
                || url.endsWith(".gov")){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }


    }
}
/*
1. Create a class named WebsiteAddress, and write a program that can check
if the given website is valid website or not

            starts with: www.
            ends with: .com, .edu, .gov
 */