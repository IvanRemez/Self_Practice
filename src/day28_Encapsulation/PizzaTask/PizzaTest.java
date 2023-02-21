package day28_Encapsulation.PizzaTask;

import day28_Encapsulation.PizzaTask.Pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaTest {

    public static void main(String[] args) {
        Pizza pie1 = new Pizza("small",3, 3);

        System.out.println(pie1.calcCost());
        System.out.println(pie1);

        Pizza pie2 = new Pizza("small",2,3);

        System.out.println(pie2);
        System.out.println("--------------------------------------------");

// add 5 pizzas and then display the total cost of entire order

        ArrayList<Pizza> pizzas = new ArrayList<>();

        Pizza p1 = new Pizza("small",3,4);
        Pizza p2 = new Pizza("small",3,4);
        Pizza p3 = new Pizza("medium",3,4);
        Pizza p4 = new Pizza("large",3,4);
        Pizza p5 = new Pizza("large",3,4);

        pizzas.addAll(Arrays.asList(p1, p2, p3, p4, p5));
        System.out.println(pizzas);
    }
}
