package oop;

import oop2.App;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone implements App {
    enum Model {
        iPhone("iPhone"), xpreria("xperia"), galaxy("galaxy");

        private final String label;
        Model model;

        public void setModel(Model model) {
            this.model = model;
        }

        Model(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
    enum Os {
        iOS("iOS"), Android("Android");

        String label;

        Os(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
//    String model;
//    String os;
    Account account;
    List<AddressBook> addressBooks = new ArrayList<>();
    List<App> apps = new ArrayList<>();
    Model model;
    Os os;

    //コンストラクタ
    public SmartPhone(Model model, Os os) {
        this.model = model;
        this.os = os;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void displayDeviceInfo() {
//        System.out.println(model);
//        System.out.println(os);
        System.out.println(model.getLabel());
        System.out.println(os.getLabel());
    }

    public void displayMyAccount() {
        System.out.println(account);
    }

    public boolean addAddressBook(AddressBook addressBook) {
//        boolean judge = false;
//        int i;
//        //配列の要素に空きがあるか調べる
//        for (i = 0; i < addressBooks.length; i++) {
//            if (addressBooks.get(i) == null) {
//                judge = true;
//                break;
//            } else {
//                judge = false;
//            }
//        }

//        if (judge = true) {
//            addressBooks[i] = addressBook;
//            System.out.println(addressBooks[i]);
//            return true;
//        } else {
//            return false;
//        }
        addressBooks.add(addressBook);
        System.out.println(addressBooks.get(0));
        return true;

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
//        boolean judge = false;
//        int i;
//        //配列の要素に空きがあるか調べる
//        for (i = 0; i < apps.length; i++) {
//           if (apps[i] == null) {
//               judge = true;
//               break;
//           } else {
//               judge = false;
//           }
//        }
//
//       if (judge) {
//           apps[0] = app;
//           return true;
//       } else {
//           return false;
//       }
       apps.add(app);
       return true;
   }

   public void start() {}

}
