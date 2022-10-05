package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        int month1 = 2;

        if (month1 == 1 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 8 || month1 == 10 || month1 == 12) {
            System.out.println("31");
        } else {
            if (month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11) {
                System.out.println("30");
            } else {
                if (month1 == 2) {
                    System.out.println("28");
                } else {
                    System.out.println("wrong number!");
                }
            }
        }
    }
}

