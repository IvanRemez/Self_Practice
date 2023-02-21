package day28_Encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.err.println("name can not be empty or blank");
            System.exit(1);
        }

        boolean isSpecialChar = false;

        for (char each : name.toCharArray()) {

            if (!Character.isLetterOrDigit(each) && !Character.isSpaceChar(each)){
                isSpecialChar = true;
                break;
            }
            if (isSpecialChar){
                System.err.println("name can not contain any special characters other than space");
                System.exit(1);
            }
        }
        if (!Character.isLetter(name.charAt(0))){
            System.err.println("name must start with letters");
            System.exit(1);
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {

        if (unitPrice < 0){
            System.err.println("unit price can not be negative");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0){
            System.err.println("quantity can not be negative");
            System.exit(1);
        }
        if (getName().equals("toilet paper") && quantity > 1){
            System.err.println("quantity can not be more than 1");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calcCost(){
        return getUnitPrice() * getQuantity();
    }

    public String toString() {
        return "Item{" +
                "name='" + getName() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                ", total cost=" + calcCost() +
                '}';
    }
}
/*
3. create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                unit price can not be negative
                quantity can not be negative
                if the Item name is toilet paper (case insensitive) then the quantity
                can not be more than 1


        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity and total cost info as
            calculated by calcCost()
 */