package day26_Constructors.RestaurantTask;

import java.time.LocalDate;
import java.util.Arrays;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant res1 = new Restaurant("Ivan","Chile",5);

        Server[] servers =
        {new Server("John",1,23,true, LocalDate.of(2023,1,1)),
        new Server("Chuck",2,20,false,LocalDate.of(2023,2,2)),
        new Server("Erik",3,25,true,LocalDate.of(2024,3,3))};

        // res1.servers.addAll(Arrays.asList(servers)); // can use the custom hire method instead:
        res1.hireServers(servers);

        System.out.println(Arrays.toString(servers));
        System.out.println("------------------------------------------------------------");

        Chef[] chefs = {new Chef("Aaron",11,60,false),
        new Chef("Klaus",22,70,true)};

        // res1.chefs.addAll(Arrays.asList(chefs)); // can use the custom hire method instead:
        res1.hireChefs(chefs);

        System.out.println(Arrays.toString(chefs));
        System.out.println("------------------------------------------------------------");

        System.out.println(res1);


    }

}
/*
4.4. Create a class LocalRestaurant that has a main method with the following:

	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those
	        	initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those
	            initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */