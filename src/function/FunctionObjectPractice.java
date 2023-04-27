package function;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionObjectPractice {
    public static void main(String[] args) {
        //奇数化偶数か判定
        Predicate<Integer> num = n -> n % 2 == 0;
        int a = 4;
        int b = 5;
        System.out.println(a + "は偶数：" + num.test(a));
        System.out.println(b + "は偶数：" + num.test(b));

        //文字列を反転させる
        Function<StringBuilder, StringBuilder> str = s -> s.reverse();
        System.out.println(str.apply(new StringBuilder("Hello World")));
//        StringBuilder str2 = new StringBuilder("AIUEO");
//        System.out.println(str2.reverse());

        //文字列を指定の文字で区切る
        Function<String, Function<String, String[]>> str2 = text -> c -> { return text.split(c); };
        String[] result = str2.apply("Noa,Neko,Inu,NNN").apply(",");
        for (String res : result) {
            System.out.print(res + " ");
        }

        //整数値に2のn乗かける
        UnaryOperator<Integer> num2 = n -> n * 2;
        //2をかける回数
        int count = 5;
        //合計値
        int sum = 10;
        for (int i = 0; i < count; i++) {
            sum = num2.apply(sum);
        }
        System.out.println();
        System.out.println(sum);

        //文字列を繰り返し連結
        BiFunction<String, Integer, String> strs = (String s, Integer n) -> { return s.repeat(n); };
        System.out.println(strs.apply("|*|", 10));

    }
}
