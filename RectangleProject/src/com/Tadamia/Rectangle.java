package com.Tadamia;

public class Rectangle extends Object{
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area(){
        return width*height;
    }

    public int perimeter(){
        return 2*(width+height);
    }

    @Override
    public boolean equals(Object o) {
        Rectangle r = (Rectangle) o;
        return this.area() == r.area() ? true : false;
    }
}
