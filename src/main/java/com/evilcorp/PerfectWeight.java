package com.evilcorp;

public class PerfectWeight {
    public static void main(String[] args) {
        double weight = 71;
        double height = 173;
        double pefrectWeight1 = (height - 100) - height*0.1 - 5;
        double pefrectWeight2 = (height - 100) - height*0.1 + 5;
        if (weight > pefrectWeight1 && weight < pefrectWeight2) {
            System.out.println("PerfectWeight");
        } else {
            System.out.println("nonPerfectWeight");
            System.out.println("needWeightForPerfect = " + "from "+ pefrectWeight1 + " to "+ pefrectWeight2);
        }
        System.out.println("YouWeight = " + weight);

    }
}
