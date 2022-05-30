package ge.ufc.geometry;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int perimeter(){
        return 2*(width+height);
    }

    int area(){
        return width*height;
    }


    public int equals(Rectangle r){
        if (this.area() < r.area())
            return -1;
        else if (this.area() == r.area())
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
