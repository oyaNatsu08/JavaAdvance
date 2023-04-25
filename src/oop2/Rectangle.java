package oop2;

public class Rectangle implements Shape {
    //上底
    int upper;
    //下底
    int bottom;
    //高さ
    int height;

    public Rectangle(int upper, int bottom, int height) {
        this.upper = upper;
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (upper + bottom) * height / 2;
    }

}
