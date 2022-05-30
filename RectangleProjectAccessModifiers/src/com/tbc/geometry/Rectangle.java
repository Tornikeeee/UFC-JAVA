package com.tbc.geometry;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    protected int perimeter(){
        return 2*(width+height);
    }

    public int equals(Rectangle r1,Rectangle r2){
        if (r1.perimeter() < r2.perimeter())
            return -1;
        else if (r1.perimeter() == r2.perimeter())
            return 0;
        else
            return 1;
    }



    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
