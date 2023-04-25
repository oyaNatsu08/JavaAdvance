package oop2;

public class Triangle implements Shape {
    //底辺
    int base;
    //高さ
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

}
