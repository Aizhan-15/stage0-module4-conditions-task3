package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        int number1 = 55;
        if ((number1 % 5 == 0) && (number1 % 11 == 0)) {
            System.out.println("Dividable");
        } else {
            System.out.println("Non-dividable");
        }
        if (number1 == 0) {
            System.out.println("cannot divide by zero");

        }
    }
}
