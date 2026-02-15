package jyanken;
public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        CPU cpu = new CPU();

        boolean win = false;

        while (!win) {

            int playerHand = player.getHand();
            int cpuHand = cpu.getHand();

            System.out.println("あなたの手: " + player.getHandName(playerHand));
            System.out.println("CPUの手: " + cpu.getHandName(cpuHand));

            if (playerHand == cpuHand) {
                System.out.println("あいこです\n");
            }
            else if ((playerHand == 0 && cpuHand == 1) ||
                     (playerHand == 1 && cpuHand == 2) ||
                     (playerHand == 2 && cpuHand == 0)) {

                System.out.println("あなたの勝ち");
                win = true;
            }
            else {
                System.out.println("あなたの負け\n");
            }
        }
    }
}