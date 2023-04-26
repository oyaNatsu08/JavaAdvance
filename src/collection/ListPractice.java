package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
    public static void main(String[] args) {
        System.out.println("名前を入力してください");
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(true) {
            String name = sc.nextLine();
            if ("exit".equals(name)) {
                break;
            } else {
                list.add(name);
            }
        }
        System.out.println("最初に入力された人：" + list.get(0));
        System.out.println("最後に入力された人：" + list.get(list.size() - 1));
        System.out.println("名前で並べ替えます");
        Collections.sort(list);
        for (String li : list) {
            System.out.println(li);
        }
    }
}
