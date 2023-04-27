package function;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("AAA", 70));
        list.add(new Student("BBB", 80));
        list.add(new Student("CCC", 40));
        list.add(new Student("DDD", 30));
        list.add(new Student("EEE", 90));

        //スコアの合計
        int sum = 0;
        for (Student li : list) {
            sum += li.score();
        }
        System.out.println("スコアの合計：" + sum);

        //スコア80以上
        list.stream().filter(student -> student.score() >= 80).forEach(System.out::println);

        //スコア降順並べ替え
        list.sort((Student s1, Student s2) -> s2.score() - s1.score());
        list.forEach(System.out::println);
    }
}

record Student(String name, int score) {}