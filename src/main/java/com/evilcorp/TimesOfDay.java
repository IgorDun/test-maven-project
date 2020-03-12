package com.evilcorp;

public class TimesOfDay {
    public static void main(String[] args) {
        int hour = -5;
        boolean morning = hour >= 4 && hour < 11;
        boolean day = hour >= 11 && hour < 16;
        boolean evening = hour >= 16 && hour < 23;
        boolean night = hour > 0 && hour < 4 || hour == 23;
        boolean errorHour = hour < 0;
        boolean anotherPlanet = hour > 23;
        if (morning) {
            System.out.println("morning = " + morning);
        }
        if (day){
            System.out.println("day = " + day);
        }
        if (evening) {
            System.out.println("evening = " + evening);
        }
        if (night) {
            System.out.println("night = " + night);
        }
        if (errorHour) {
            System.out.println("Please, enter correct hour");
        }
        if (anotherPlanet) {
            System.out.println("Please, return from another planet to Earth");
        }
    }
}
