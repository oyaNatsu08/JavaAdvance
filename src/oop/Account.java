package oop;

public class Account {
    String name;
    String tel;
    String email;
    String address;

    //コンストラクタ
    public Account(String name, String tel, String email, String address) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    public String getAccountInfo() {
        String str = this.name + " " + this.tel + " " + this.email + " " + this.address;
        return str;
    }
}
