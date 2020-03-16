package com.evilcorp;

public class controlOnAttraction {
    public static void main(String[] args) {
        final int height = 150;
        System.out.println("height = " + height);
        final boolean haveParents = false;
        System.out.println("haveParents = " + haveParents);
        if (height >= 160 || haveParents) {
            System.out.println("Pass its");
        }
        else System.out.println("You don't pass");
    }
}
