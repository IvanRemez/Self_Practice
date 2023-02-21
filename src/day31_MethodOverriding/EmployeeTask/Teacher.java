package day31_MethodOverriding.EmployeeTask;

public class Teacher extends Employee{

    public Teacher(String name, String jobTitle, String companyName, int age, int id,
                   int salary, char gender) {
        super(name, jobTitle, companyName, age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }
}
