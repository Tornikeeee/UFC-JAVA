package com.Tadamia;

import ge.ufc.geometry.Rectangle;

public class Main{

    public static void main(String[] args) {
        //default access modifier
        Rectangle r1 = new Rectangle(15, 7);
        Rectangle r2 = new Rectangle(15, 4);
        System.out.println(r1.equals(r2));

        //protected access modifier
        ChildeRec cR1 = new ChildeRec(15,13);
        ChildeRec cR2 = new ChildeRec(15,90);
        System.out.println(cR1.equals(cR1,cR2));
    }
}
