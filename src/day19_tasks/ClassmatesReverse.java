package day19_tasks;

public class ClassmatesReverse {

    public static void main(String[] args) {

        String[] arr = {"John Smith", "John Denver", "Josh Adams", "John Adams", "Billy Joel"};

        for (int i = 0; i < arr.length; i++) {

            String name = arr[i];
            String reverseName = "";

            for (int j = name.length() - 1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }
            System.out.println(reverseName);
        }


    }
}
/*
2. create string array, and store the names of your  classmates (10)
            reverse each student's name and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */