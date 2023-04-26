package Map1;

import java.util.HashMap;

public class FibonacciTest {
    public static void main(String[] args) {
        Fibonacci test = new Fibonacci();
        System.out.println(test.calc(94));
        Fibonacci test2 = new Fibonacci(test.cache);
        System.out.println(test2.calc(50));

    }
}
