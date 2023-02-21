package day12_tasks;

public class DaysInMonth {

    public static void numberOfDays(String month) {
        month = ("" + month.charAt(0)).toUpperCase() + month.substring(1).toLowerCase();

        String result = month + " has "; // result concatenation

        switch (month) {
            case "February":
                result += 28 + " days"; // concatenates ^^ result to " 28 days"
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                result += 30 + " days";
                break;

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                result += 31 + " days";
                break;

            default:
                result = "Invalid month";
        }

        System.out.println(result);

    }

    public static void main(String[] args) {

        numberOfDays("september");

    }
}
/*
5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */