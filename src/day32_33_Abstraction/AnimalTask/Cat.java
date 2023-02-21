package day32_33_Abstraction.AnimalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender) {
        super(name, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println(getBreed() + " is eating cat food");
    }
}
