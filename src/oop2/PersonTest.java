package oop2;

import java.util.Arrays;

public class PersonTest {
    public static void main(String[] args) {
        //配列の作成
        Person[] persons = { new Person("伊藤", "イトウ", 30),
                new Person("佐藤", "サトウ", 24),
                new Person("山崎", "ヤマザキ", 25),
                new Person("黒木", "クロキ", 23),
                new Person("森", "モリ", 28) };

        //昇順に並べ替え compareTo
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].compareTo(persons[j+1]) > 0) {
                    Person tmp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = tmp;
                }
            }
        }
        for (Person person : persons) {
            System.out.println(person);
        }

        //昇順に並べ替え Arrays.sort()
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

    }
}
