package com.Tadamia;

public class Main {

    public static void main(String[] args) {

        {
            System.out.println("inner scope");
            int i = 5;
            System.out.println(i);
        }


        int i;
        for (i = 0; i < 15; i++) {
            i += i;
        }

        System.out.println("outer scope");
        System.out.println(i);


    }
}
