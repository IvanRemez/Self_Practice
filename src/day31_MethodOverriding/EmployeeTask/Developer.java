package day31_MethodOverriding.EmployeeTask;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, String jobTitle, String companyName, int age, int id,
                     int salary, char gender, String programmingLanguage) {
        super(name, jobTitle, companyName, age, id, salary, gender);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + getName() + " is coding in " + programmingLanguage);
    }
}
