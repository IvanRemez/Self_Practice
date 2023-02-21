package day27_AccessModifiers;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;

    public static String schoolName, fieldOfStudy, programmingLanguage, secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {
        schoolName = "Cydeo School";
        fieldOfStudy = "IT";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void printSecretCode(){
        System.out.println(secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", schoolName=" + schoolName +
                ", fieldOfStudy=" + fieldOfStudy +
                ", programmingLanguage=" + programmingLanguage +
                ", secretCode=" + secretCode +
                '}';
    }
}
/*
2. create a class named CydeoStudent

            Variables:

                name, gender, age, batchNumber, groupNumber, schoolName,
                fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */