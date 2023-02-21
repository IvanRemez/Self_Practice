package day28_Encapsulation.PizzaTask;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public static String shape;

    static {
        shape = "Circle";
    }

    public static void displayShapeOfPizza(){
        System.out.println("Shape of pizza is: " + shape);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")
                || size.equalsIgnoreCase("large"))){
            System.err.println("size of the pizza can only be small, medium, large");
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {

        if (numberOfCheeseTopping < 0){
            System.err.println("Number of cheese topping can not be negative");
            System.exit(1);
        }
        if (size.equalsIgnoreCase("small")){
            if (numberOfCheeseTopping > 3){
                System.err.println("the maximum number of cheese topping is: 3");
                System.exit(1);
            }
        } else if (size.equalsIgnoreCase("medium")) {
            if (numberOfCheeseTopping > 4) {
                System.err.println("the maximum number of cheese topping is: 4");
                System.exit(1);
            }
        }else {
            if (numberOfCheeseTopping > 5) {
                System.err.println("the maximum number of cheese topping is: 5");
                System.exit(1);
            }
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {

        if (numberOfPepperoniTopping < 0){
            System.err.println("Number of pepperoni topping can not be negative");
            System.exit(1);
        }
        if (size.equals("small")){
            if (numberOfPepperoniTopping > 4){
                System.err.println("the maximum number of cheese topping is: 4");
                System.exit(1);
            }
        } else if (size.equals("medium")) {
            if (numberOfPepperoniTopping > 5) {
                System.err.println("the maximum number of cheese topping is: 5");
                System.exit(1);
            }
        }else {
            if (numberOfPepperoniTopping > 6) {
                System.err.println("the maximum number of cheese topping is: 6");
                System.exit(1);
            }
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }
    // ^^ ***this Constructor makes the variables VALID so after object is created we DO NOT need to
    // use Getter method to assign the variables ***

    public int calcCost(){
        int totalCost = (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        if (size.equalsIgnoreCase("small")){
            totalCost += 10;
        } else if (size.equalsIgnoreCase("medium")) {
            totalCost += 12;
        }else {
            totalCost += 14;
        }
        return totalCost;
    }
    //      ** instance variables are VALID after OBJECT is created so no need to use getter methods
            // can pass variables as regular
        // ex. getSize() --> size

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCost=" + calcCost() +
                '}';
    }//      ** instance variables are VALID after OBJECT is created so no need to use getter methods
    // can pass variables as regular
    // ex. getSize() --> size
}
/*
4. Create class named Pizza:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields
                        Conditions:
                            size of the pizza can only be small, medium, large. case insensitive

                            Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)


                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */