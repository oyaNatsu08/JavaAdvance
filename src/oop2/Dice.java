package oop2;

public class Dice {
    //サイコロの出目
    int diceEye;
    //サイコロを振った回数
    int count;

    public int cast () {
        diceEye = (int)Math.round(Math.random() * 5 + 1);
        count++;
        return diceEye;
    }

    public int see() {
        if (count == 0) {
            return 1;
        } else {
            return diceEye;
        }
    }
}
