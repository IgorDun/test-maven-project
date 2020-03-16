package com.evilcorp;

public class weightLossProgram {
    public static void main(String[] args) {
        final int limitKk = 1400;
        final int chocolateKk = 340;
        final int porridgeKk = 250;
        final int fatKk = 500;
        final int consumedKk = 1060;
        System.out.println("consumedKk = " + consumedKk);
        int diffKk = limitKk - consumedKk;
        System.out.println("diffKk = " + diffKk);
        if (diffKk >= fatKk) {
            System.out.println("can eat Fat or Chocolate or Porridge");
        }
            else if (diffKk >= chocolateKk) {
            System.out.println("can eat Chocolate or Porridge");
            }
                else if (diffKk >= porridgeKk) {
            System.out.println("can eat Porridge");
                }
                    else if (diffKk < porridgeKk) {
                        System.out.println("Today you will be hungry");
                    }
    }
}
