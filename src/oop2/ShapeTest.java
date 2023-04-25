package oop2;

public class ShapeTest {
    static double[] results;
    public static double[] getTotalArea(Shape[] shapes) {
        results = new double[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            results[i] = shapes[i].calculateArea();
        }
        return results;
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Triangle(2, 5),
                new Rectangle(2, 3, 4),
                new Circle(5)
        };
        double[] results = getTotalArea(shapes);

        double sum = 0.0;

        for (double result : results) {
            System.out.print("面積：");
            System.out.println(result);
            sum += result;
        }
        System.out.println("3つの図形の合計：" + sum);
    }
}
