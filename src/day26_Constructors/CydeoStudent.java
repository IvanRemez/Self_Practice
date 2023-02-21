package day26_Constructors;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender, grade;
    public int id;
    public String batchNumber, groupNumber;

    public static String schoolName = "Cydeo School",
            magicWord = "Wooden Spoon";

    public CydeoStudent(String name, int age, char gender, char grade, int id, String batchNumber, String groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studying in batch #" + batchNumber);
    }

    public void attendClass(){
        System.out.println(name + " is attending classes at " + schoolName);
    }

    public void printSchoolName(){
        System.out.println(schoolName);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", id=" + id +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", magicWord='" + magicWord + '\'' +
                '}';
    }
}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */