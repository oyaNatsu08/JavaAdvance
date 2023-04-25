package oop2;

public class CheatDice extends Dice {
    @Override
    public int cast () {
        count++;
        if (count % 6 == 0) {
            diceEye = 6;
            return diceEye;
        } else {
            diceEye = (int)Math.round(Math.random() * 5 + 1);
            return diceEye;
        }
    }
}
