package com.evilcorp;

public class battleSithsVsJedays {
    public static void main(String[] args) {
        final int heightJedi = 1;
        final int heightSith = 1;
        final boolean jediHigher = heightJedi > heightSith;
        final boolean sithHigher = heightJedi < heightSith;
        final boolean faceToFace = heightJedi == heightSith;
        final boolean palpatine = false;
        final boolean obiVanVsDarthMoll = false;
        if ((jediHigher || sithHigher || (faceToFace && obiVanVsDarthMoll)) && !palpatine) {
            System.out.println("Jedi will win! Go fight!");
        } else {
            System.out.println("Jedi will lost! Run beach!");
        }

    }
}
