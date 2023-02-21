package day22_tasks;

public class UpperToLower {

    public static void main(String[] args) {

        String str = "JAVA java";

        int isUppercase = 0,
                isLowercase = 0;

        for (char ch : str.toCharArray()) {

            if (Character.isUpperCase(ch)){
                isUppercase++;
            } else if (Character.isLowerCase(ch)) {
                isLowercase++;
            }else {
                continue;
            }
        }
        System.out.println(isUppercase == isLowercase);
    }
}
/*
6. Write program that returns true if the total number of upper case characters are
equal to total number of Lowercase characters of a string

        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods
 */