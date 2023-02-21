package day04_practice;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "Daniel",
                gender = "Male",
                company_name = "Google Inc",
                job_title = "Software Developer";
        int age = 28,
                salary = 90000;

        System.out.println(name + " is " + age + " years old, gender is "
                + gender + ".\n" + name + " works at " + company_name + " as a "
                + job_title + ".\n" + name + " makes $" + salary + " per year.");

    }
}

/*
1. CreateaclassnamedEmployeeInfo.java
2. DeclarethefollowingVariables:
    1. name
    2. age
    3. gender
    4. company_name
    5. jobTitle
    6. salary
3. Useconcatenationtodisplaythefullinfooftheemployee:
    Ex:
        given data:
            name = “Daniel”
            age = 28
            gender = “Male”
            company_name = “Google Inc”
            job_title = ”Software Developer"
            salary = 90000
output:
    Daniel is 28 years old, gender is Male.
    Daniel works at Google Inc as a Software Developer.
    Daniel makes $ 90000 per year.
    */