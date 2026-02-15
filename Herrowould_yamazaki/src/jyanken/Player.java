package jyanken;
import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);

    public int getHand() {
        System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
        return scanner.nextInt();
    }

    public String getHandName(int hand) {
        switch (hand) {
            case 0: return "グー";
            case 1: return "チョキ";
            case 2: return "パー";
            default: return "不正な値";
        }
    }
}

