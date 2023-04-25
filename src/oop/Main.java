package oop;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhoneSE", "iOS");
        Account account = new Account("N", "000-0000-0000", "xxx@icloud.com", "○○○○○○");
        AddressBook addressBook = new AddressBook("A", "000-0000-0000", "yyy@icloud.com");
        AddressBook addressBook2 = new AddressBook("B", "000-0000-0000", "zzz@icloud.com");

        //modelとosの情報を表示
        smartPhone.displayDeviceInfo();

        //Accountの情報を整形して返す
        System.out.println(account.getAccountInfo());

        //accountの情報を表示
        smartPhone.setAccount(account);
        smartPhone.displayMyAccount();

        //addressBooksに追加する処理
        //アドレス帳に情報を追加する処理
        smartPhone.addAddressBook(addressBook);
        smartPhone.addAddressBook(addressBook2);

        //インストールしたアプリを追加
        //smartPhone.addApp("App1");
        //インストールしたアプリを表示
        //smartPhone.displayAppList();

        System.out.println();



        //石取りゲームのメインメソッド処理
        //参加プレイヤーオブジェクト
        Player[] players = {
                new Player("Noa"),
                new Player("Neko"),
                new Player("Inu")
        };
        //石取りゲームマークオブジェクト
        Stone mark = new Stone("☆", 50, 5);
        //石取りゲームメイン処理オブジェクト
        StoneGame stoneGame = new StoneGame(players, 0, mark);
        stoneGame.start();

        //石取りゲームインストール
        smartPhone.install(stoneGame);
        //インストールしたアプリを表示
        smartPhone.displayAppList();

    }
}
