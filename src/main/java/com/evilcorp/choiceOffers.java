package com.evilcorp;

public class choiceOffers {
    public static void main(String[] args) {
        final int salaryFirst = 85_000;
        final int salarySecond = 95_000;
        final int travelTimeFirst = 2;
        final int travelTimeSecond = 4;
        final int workTime = 8;
        final int salaryPerHourFirst = salaryFirst / (workTime + travelTimeFirst);
        System.out.println("salaryPerHourFirst = " + salaryPerHourFirst);
        final int salaryPerHourSecond = salarySecond / (workTime + travelTimeSecond);
        System.out.println("salaryPerHourSecond = " + salaryPerHourSecond);
        if (salaryPerHourFirst > salaryPerHourSecond) {
            System.out.println("Choose First Offer");
        }
        else System.out.println("Choose Second Offer");
    }
}
