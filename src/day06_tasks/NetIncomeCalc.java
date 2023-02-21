package day06_tasks;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary = 100_000;
        boolean isMarried = true;


        if (salary <= 79_000 && isMarried){
            System.out.println(salary*85/100);
        }
        if (salary <= 79_000 && !isMarried){
            System.out.println(salary*80/100);
        }
        if (salary <= 99_000 && salary >= 80_000 && isMarried){
            System.out.println(salary*80/100);
        }
        if (salary <= 99_000 && salary >= 80_000 && !isMarried){
            System.out.println(salary*75/100);
        }
        if (salary <= 129_000 && salary >= 100_000 && isMarried){
            System.out.println(salary*75/100);
        }
        if (salary <= 129_000  && salary >= 100_000 && !isMarried){
            System.out.println(salary*70/100);
        }
        if (salary <= 130_000 && isMarried){
            System.out.println(salary*70/100);
        }
        if (salary <= 130_000 && !isMarried){
            System.out.println(salary*65/100);
        }


    }
}

/*
9. Create a class named NetIncomeCalc,
Write a program that can calculate the salary after tax
based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax
 */