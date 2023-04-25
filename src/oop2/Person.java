package oop2;
public record Person(String name, String kana, int age) implements Comparable<Person> {
    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }
}