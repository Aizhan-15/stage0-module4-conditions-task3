package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        int salary1 = 25000;
        if (salary1 <= 10000) {
            System.out.println(salary1 * 0.15);
        } else {
            if (10000 < salary1 && salary1 <= 20000) {
                System.out.println(salary1 * 0.18);
            } else {
                if (salary1 > 20000) {
                    System.out.println(salary1 * 0.2);
                } else {
                    if (salary1 == 0) {
                        System.out.println("wrong input!");
                    }
                }
            }
        }
    }
}
