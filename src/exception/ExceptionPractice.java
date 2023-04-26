package exception;

import java.util.Scanner;

public class ExceptionPractice {
    public static String judgeScore(int score) throws IlligalScoreException {
        if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 70 && score < 80) {
            return "B";
        } else if (score >= 60 && score < 70) {
            return "C";
        } else if (score <= 59 && score >= 0) {
            return "D";
        } else {
            throw new IlligalScoreException();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int num = Integer.parseInt(sc.nextLine());
                String result = judgeScore(num);
                System.out.println(result);
                break;
            } catch (IlligalScoreException e) {
                System.out.println("スコアが不正です");
            } catch (NumberFormatException e) {
                System.out.println("数値を入力してください");
            }
        }
        sc.close();
    }
}
