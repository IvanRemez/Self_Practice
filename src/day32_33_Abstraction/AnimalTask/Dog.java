package day32_33_Abstraction.AnimalTask;

public class Dog extends Animal{

    public Dog(String name, String breed, char gender) {
        super(name, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println(getBreed() + " is eating dog food");
    }
}
