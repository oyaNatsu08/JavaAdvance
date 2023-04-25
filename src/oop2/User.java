package oop2;

public class User {
    String name;
    String birthPlace;
    String birthDate;

    public User(String name, String birthPlace, String birthDate) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        User user = (User)o;
        if (this.name.equals(user.name) && this.birthPlace.equals(user.birthPlace) && this.birthDate.equals(user.birthDate)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "名前：" + this.name + ",出身地：" + this.birthPlace + ",生年月日：" + this.birthDate;
    }

}

class UserTest {
    public static void main(String[] args) {
        User user1 = new User("Natsu", "Japan", "20230425");
        User user2 = new User("N", "Japan", "20230425");

        System.out.println(user1.equals(user2));
        System.out.println(user1.toString());
    }
}
