package day27_AccessModifiers;

public class Person {

    public String name, language, planet;
    public int age;
    public char gender;

    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name, String language, String planet, int age, char gender) {
        this.name = name;
        this.language = language;
        this.planet = planet;
        this.age = age;
        this.gender = gender;
    }

    static {
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    public void printPlanetName(){
        System.out.println("Earth");
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isHuman=" + isHuman +
                ", hasNose=" + hasNose +
                ", numberOfWings=" + numberOfWings +
                ", numberOfHead=" + numberOfHead +

                '}';
    }
}
/*
4. Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman,
                hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */