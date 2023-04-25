package oop2;

public class DiceTest {
    public static void main(String[] args) {
        Dice dice = new Dice();
        CheatDice cheatDice = new CheatDice();
        for (int i = 1; i <= 30; i++) {
            System.out.println("ダイスを振る" + i + "回目");
            dice.cast();
            System.out.println("ダイスの出目：" + dice.see());
            cheatDice.cast();
            System.out.println("チートダイスの出目：" + cheatDice.see());
            System.out.println("------------------------------");
        }
    }
}
