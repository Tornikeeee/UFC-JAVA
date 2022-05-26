package com.Tadamia;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();
        Rectangle rectangle4 = null;

        rectangle1.setHeight(4);
        rectangle1.setWidth(6);

        System.out.println(String.format("მართკუთხედი 1 %d x %d", rectangle1.getHeight(), rectangle1.getWidth()));
        System.out.println(String.format("მართკუთხედი 2 %d x %d", rectangle2.getHeight(), rectangle2.getWidth()));

        rectangle2.setHeight(4);
        rectangle2.setWidth(6);

        System.out.println("სხვადასხვა " + (rectangle1==rectangle2));

        rectangle1 = rectangle2;
        System.out.println("იგივე " + (rectangle1==rectangle2));

        System.out.println("იცვლება rectangle1");
        rectangle1.setHeight(11);
        rectangle1.setWidth(25);
        System.out.println("ცვლილების შემდეგ");
        System.out.println(String.format("მართკუთხედი 2 %d x %d", rectangle2.getHeight(), rectangle2.getWidth()));


        System.out.println(String.format("მართკუთხედი 3(setterების გარეშე) %d x %d", rectangle3.getHeight(), rectangle3.getWidth()));


        rectangle2 = new Rectangle();
        rectangle2.setWidth(9);
        rectangle2.setHeight(17);
        System.out.println("ფართობების შედარება");
        System.out.println(equals(rectangle1,rectangle2));


        System.out.println("ფართობების შედარება (Override)");
        System.out.println(rectangle1.equals(rectangle2));

        System.out.println("მართკუთხედი 4(null)");
        System.out.println(rectangle4.getHeight() + " x " + rectangle4.getWidth());
    }

    public static int equals(Rectangle r1, Rectangle r2){
        if (r1.area() > r2.area())
            return 1;
        else if (r1.area() > r2.area())
            return -1;
        else
            return 0;
    }
}
