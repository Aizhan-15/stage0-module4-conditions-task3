package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        int month1 = 11;

        if (month1 == 1 || month1 == 2 || month1 == 12) {
            System.out.println("Winter");
        } else {
            if (month1 == 3 || month1 == 4 || month1 == 5) {
                System.out.println("Spring");
            } else {
                if (month1 == 6 || month1 == 7 || month1 == 8) {
                    System.out.println("Summer");
                } else {
                    if (month1 == 9 || month1 == 10 || month1 == 11) {
                        System.out.println("Autumn");
                    } else {
                        System.out.println("wrong number!");
                    }
                }
            }
        }

    }
}
