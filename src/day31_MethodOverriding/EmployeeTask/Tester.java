package day31_MethodOverriding.EmployeeTask;

public class Tester extends Employee{

    public Tester(String name, String jobTitle, String companyName, int age, int id,
                  int salary, char gender) {
        super(name, jobTitle, companyName, age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }
}
/*
2. Create the following subclasses and override the work method in each subclass:

            1. Tester
                    work(): jobTitle + " " + name + " is testing"

            2. Developer
                    Extra variable:
                        programmingLanguage

                    work(): jobTitle + name + " is coding in "+programmingLanguage

            3. Teacher
                    work(): name + " is teaching"

            4. Driver
                    work(): name + " is driving"


            if any adidtional field or methods needed, please add them
 */