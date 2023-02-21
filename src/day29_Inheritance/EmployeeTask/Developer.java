package day29_Inheritance.EmployeeTask;

public class Developer extends Employee{

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        if (!(programmingLanguage.equals("Java") || programmingLanguage.equals("JavaScript") ||
                programmingLanguage.equals("Python") || programmingLanguage.equals("Ruby") ||
                programmingLanguage.equals("C#") || programmingLanguage.equals("C++") ||
                programmingLanguage.equals("Swift"))) {
            System.err.println("Invalid programming language: " + programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, String programmingLanguage) {
        setInfo(name, gender, age, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public void coding(){
        System.out.println(getName() + " is coding");
    }


    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", ID=" + getID() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                "programmingLanguage='" + getProgrammingLanguage() + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Developer dev = new Developer();
        System.out.println(dev);
    }
}
/*
2. Create a custom Class named Developer

			Variables:
				name, gender, age, id, jobTitle, salary, programmingLanguage

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in
				the print statement
 */