package curriculum.c;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("プレイヤー名を入力してください: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        Daemon daemon = new Daemon("daemon_status.txt");

        FileWriter writer = new FileWriter("battle_log.txt");

        writer.write("=== バトル開始 ===\n");
        writer.write(player.getStatus() + "\n");
        writer.write(daemon.getStatus() + "\n\n");

        // ✅ 先攻決定
        Character first;
        Character second;

        if (player.sp > daemon.sp) {
            first = player;
            second = daemon;
        } else if (player.sp < daemon.sp) {
            first = daemon;
            second = player;
        } else {
            if (new Random().nextBoolean()) {
                first = player;
                second = daemon;
            } else {
                first = daemon;
                second = player;
            }
        }

        writer.write("先攻: " + first.name + "\n\n");

        // ✅ ターン制バトル
        while (player.isAlive() && daemon.isAlive()) {

            first.attack(second);
            writer.write(first.name + " の攻撃！\n");
            writer.write(second.name + " のHP: " + second.hp + "\n\n");

            if (!second.isAlive()) break;

            second.attack(first);
            writer.write(second.name + " の攻撃！\n");
            writer.write(first.name + " のHP: " + first.hp + "\n\n");
        }

        // ✅ 結果
        if (player.isAlive()) {
            writer.write("勝者: " + player.name + "\n");
        } else {
            writer.write("勝者: " + daemon.name + "\n");
        }

        writer.write("=== バトル終了 ===");
        writer.close();

        System.out.println("バトル終了！結果は battle_log.txt に保存されました。");
    }
}
