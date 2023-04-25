package oop;

import oop2.App;

public class SmartPhone implements App {
    String model;
    String os;
    Account account;
    AddressBook[] addressBooks;
    App[] apps;

    //コンストラクタ
    public SmartPhone(String model, String os) {
        this.model = model;
        this.os = os;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void displayDeviceInfo() {
        System.out.println(model);
        System.out.println(os);
    }

    public void displayMyAccount() {
        System.out.println(account);
    }

    public boolean addAddressBook(AddressBook addressBook) {
        addressBooks = new AddressBook[3];
        boolean judge = false;
        int i;
        //配列の要素に空きがあるか調べる
        for (i = 0; i < addressBooks.length; i++) {
            if (addressBooks[i] == null) {
                judge = true;
                break;
            } else {
                judge = false;
            }
        }

        if (judge = true) {
            addressBooks[i] = addressBook;
            System.out.println(addressBooks[i]);
            return true;
        } else {
            return false;
        }

    }

    public void displayAppList() {
        for (App app : apps) {
            System.out.println(app);
        }
    }

    //追加メソッド
    //インストールしたアプリを追加
//    public void addApp(String app) {
//        apps = new String[1];
//        apps[0] = app;
//    }

    //アプリをインストールするメソッド
   public boolean install(App app) {
        apps = new App[1];
        boolean judge = false;
        int i;
        //配列の要素に空きがあるか調べる
        for (i = 0; i < apps.length; i++) {
           if (apps[i] == null) {
               judge = true;
               break;
           } else {
               judge = false;
           }
        }

       if (judge) {
           apps[0] = app;
           return true;
       } else {
           return false;
       }
   }

   public void start() {}

}
