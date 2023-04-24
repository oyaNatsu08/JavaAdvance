package record;

public class PersonTest {
    public static void main(String[] args) {
        //配列の作成
        Person[] persons = { new Person("伊藤", "イトウ", 30),
                new Person("佐藤", "サトウ", 24),
                new Person("山崎", "ヤマザキ", 25),
                new Person("黒木", "クロキ", 23),
                new Person("森", "モリ", 28) };

        int max = persons[0].age();
        int min = persons[0].age();

        //最年長と最年少の出力
        for (int i = 1; i < persons.length; i++) {
            if (persons[i].age() > max) {
                max = persons[i].age();
            }
            if (persons[i].age() < min) {
                min = persons[i].age();
            }
        }
        System.out.println("最年長：" + max);
        System.out.println("最年少：" + min);

        //年齢の降順に配列の並び替え
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].age() < persons[j+1].age()) {
                    Person tmp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = tmp;
                }
            }
        }
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
