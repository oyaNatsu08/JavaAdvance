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

        String[] text = {"三角形", "台形", "円"};

        double sum = 0.0;

        for (int i = 0; i < results.length; i++) {
            System.out.print(text[i] + "の面積：");
            System.out.println(results[i]);
            sum += results[i];
        }
        System.out.println("3つの図形の合計：" + sum);
    }
}
