package day27_AccessModifiers;

public class Dog {

    public String breed, size, color;
    public char gender;
    public int age;

    public static int numberOfLegs, numberOfEyes, numberOfWings;
    public static boolean isFriendly;

    public Dog(String breed, String size, String color, char gender, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    static {
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;
        isFriendly = true;
    }

    public void eat(){
        System.out.println("The " + breed + " is eating");
    }

    public void drink(){
        System.out.println("The " + breed + " is drinking");
    }

    public void sleep(){
        System.out.println("The " + breed + " is sleeping");
    }

    public void play(){
        System.out.println("The " + breed + " is playing");
    }

    public void bark(){
        System.out.println("The " + breed + " is barking");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
3.  Create a class called Dog

            Variables:
                breed, size, gender, age, color, numberOfLegs,
                numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */