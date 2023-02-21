package day29_Inheritance.CarTask;

public class Toyota extends Car{

    public static void main(String[] args) {

        Toyota car1 = new Toyota();
        car1.setInfo("Toyota","RAV4","Gray",2020,35000);

        System.out.println(car1);
    }

}
/*
carTask:
	1. Create a class named Toyota
				Variables:
					make, model, year, color, price

				Encapsulate all the fields
					Conditions:
						1. year can not be zero or negative
						2. price can not be zero or negative

				Methods:
					setInfo(): sets the make to "Toyota" and rest of the fields will
					be set based on the given arguments
					toString(): prints Toyota object info when the object is passed
					in the print statement
 */