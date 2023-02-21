package day29_Inheritance.PhoneTask;

public class iPhone extends Phone{

    public void faceTime(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " is FaceTiming " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(getBrand() + " " + getModel() + " is FaceTiming " + email);
    }

}
/*
1. Create a named IPhone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will
					be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed
					in the print statement
 */