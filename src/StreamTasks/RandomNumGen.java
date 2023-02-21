package StreamTasks;

public class RandomNumGen {

    public static void main(String[] args) {

        int min = 1;
        int max = 9;

        System.out.println("Random value of type int between "+min+" to "+max+ ":");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}
