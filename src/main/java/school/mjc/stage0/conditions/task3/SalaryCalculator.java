package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(double salary) {
        double salary2 = (double) salary;
        if(salary > 1 && salary <= 10000){
            double i = salary *= 0.15;
            salary2 -= i;
            System.out.println(salary2);
        }
        else if(salary > 10000 && salary <= 20000){
            // 18%
            double i = salary *= 0.18;
            salary2 -= i;
            System.out.println(salary2);
        }
        else if(salary > 20000 ){
            // 20%
            double i = salary *= 0.20;
            salary2 -= i;
            System.out.println(salary2);
        }
        else if(salary <= 0 ){
            System.out.println("wrong input!");
        }
    }

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.calculateSalary(-1);
    }
}
