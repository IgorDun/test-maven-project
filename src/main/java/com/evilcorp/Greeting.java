package com.evilcorp;

public class Greeting {
    public static void main(String[] args) {
        int hour = 18;
        int day = 6;
        boolean workDays = day >= 1 && day < 6;
        boolean weekDays = day == 6 || day == 7;
        boolean workHours = hour >= 0 && hour < 8;
        boolean sleepAwayHours = hour > 8 && hour <= 11;
        boolean dayOffHours = hour > 11;
        boolean weekdayHours = hour >= 0 && hour < 12;
        boolean weekSleepHours = hour > 12 && hour <= 16;
        boolean weekWakeUp = hour > 16 && hour <= 18;
        boolean weekSleepModeLost = hour > 18 && hour <= 23;
        if (workDays) {
            if (workHours) {
                System.out.println("Good Morning!");
            }
            if (sleepAwayHours) {
                System.out.println("Everything is lost, you overslept");
            }
            if (dayOffHours) {
                System.out.println("Turn on the mail, make a letter that you take a day off");
            }
        }
        if (weekDays) {
            if (weekdayHours) {
                System.out.println("Good Morning!");
            }
            if (weekSleepHours) {
                    System.out.println("Go to sleep more");
            }
            if (weekWakeUp) {
                    System.out.println("Wake up, go to play on the Witcher");
            }
            if (weekSleepModeLost) {
                    System.out.println("So bad, sleep mode lost");
            }
        }
    }
}
