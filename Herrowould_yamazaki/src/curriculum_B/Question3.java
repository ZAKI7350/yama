package curriculum_B;

public class Question3 {
	public static void main(String[] args) {
		for (int i = 5; i <= 10; i++) {
        System.out.println(i);
		}
		for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
		for (int i = 10; i >= 1; i--) {
        System.out.println(i);
		}
        int sum = 0;
        for (int j = 1; j <= 100; j++) {
            sum += j;
        }
        System.out.println("合計: " + sum);
    
        for (int l = 1; l <= 5; l++) {       // 行数（1〜5）
            for (int j = 1; j <= l; j++) {   // 各行の「*」の数
                System.out.print("*");
            }
            System.out.println();             // 改行
        }
        int i = 1; // 初期値の設定

        while (i <= 10) { // 条件：i が 10 以下の間くり返す
            System.out.println(i);
            i++; // i の値を 1 ずつ増やす
        }
        for (int l = 1; l <= 9; l++) {  // 段（1〜9）
            for (int s = 1; s <= 9; s++) {  // 掛ける数（1〜9）

                String a = String.format("%02d", l);
                String b = String.format("%02d", s);
                String ans = String.format("%02d", i * l);

                System.out.print(a + " * " + b + " = " + ans);

                if (l != 9) {
                    System.out.print(" || ");  // 区切り
                }
            }
            System.out.println(); // 段ごとに改行
        }
    }
}
