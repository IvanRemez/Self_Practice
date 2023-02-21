package day28_Encapsulation;

public class Rectangle {

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0){
            System.err.println("Length cannot be negative");
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            System.err.println("Width cannot be negative");
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double calcArea(){
        return getLength() * getWidth();
    }

    public double calcPerimeter(){
        return (2 * getLength()) + (2 * getWidth());
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
3. Create a class named Rectangle:
        Private variables:
            width, length

        Encapsulate all the fields
                Conditions:
                    width of the rectangle should not be negative
                    length of the rectangle should not be negative

        Add a constructor that allows user to set all the fields when the object is
        created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcArea(): returns the area of rectangle
            calcPerimeter(): returns the perimeter of rectangle
            toString(): can display the width, length, area, and perimeter of rectangle
            when object is passed in print statement
 */