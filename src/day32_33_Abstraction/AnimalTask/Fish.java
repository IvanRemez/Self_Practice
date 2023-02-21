package day32_33_Abstraction.AnimalTask;

public class Fish extends Animal{

    public Fish(String name, String breed, char gender) {
        super(name, breed, gender);
    }

    @Override
    public void eat() {
        System.out.println(getBreed() + " is eating fish food");
    }
}
