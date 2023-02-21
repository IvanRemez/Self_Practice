package day08_tasks;

public class Browser {

    public static void main(String[] args) {

        String browserName = "ch";

        switch (browserName){
            case "chrome":
                System.out.println("chrome");
                break;
            case "firefox":
                System.out.println("firefox");
                break;
            case "opera":
                System.out.println("opera");
                break;
            case "safari":
                System.out.println("safari");
                break;
            case "edge":
                System.out.println("edge");
                break;
            default:
                System.out.println("Invalid Browser");


        }

    }
}
/*
9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */