package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        // Q1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        
        
        
        // Q2
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        
        
        
        // Q3
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        
        
        
        
        // Q4
        int total = 0;
        for (int i = 1; i <= 100; i++) {
        	total += i;
        }
        System.out.println(total
        		);
        System.out.println();

        
        
        
        // Q5
        for (int i = 1; i <= 5; i++) {
            String line = "";
            for (int j = 1; j <= i; j++) {
                line += "*";
            }
            System.out.println(line);
        }
        System.out.println();

        
        
        
        // Q6
        int A1 = 1;
        while (A1 <= 10) {
            System.out.println(A1);
            A1++;
        }
        System.out.println();

        
        
        
        // Q7
        int A2 = 2;
        while (A2 <= 20) {
            System.out.println(A2);
            A2 += 2;
        }
        System.out.println();

        
        
        
        // Q8
        int A3 = 10;
        while (A3 >= 1) {
            System.out.println(A3);
            A3--;
        }
        System.out.println();

        
        
        
        // Q9
        int total_while = 0;
        int A4 = 1;
        while (A4 <= 100) {
        	total_while += A4;
            A4++;
        }
        System.out.println(total_while);
        System.out.println();

        
        
        
        // Q10
        Scanner sc = new Scanner(System.in);
        int inputNum;
        while (true) {
            System.out.print(" ");
            inputNum = sc.nextInt();
            if (inputNum == 0) {
                System.out.println("終了しました");
                break;
            }
        }
        System.out.println();

        
        
        
        
        // Q11
        for (int i = 1; i <= 9; i++) {
            String row = "";
            for (int j = 1; j <= 9; j++) {
                String cell = String.format("%02d * %02d = %02d", i, j, i * j);
                row += (j == 1) ? cell : " || " + cell;
            }
            System.out.println(row);
        }
        System.out.println();

        
        
        
        // Q12
        sc.nextLine(); 
        System.out.print("商品を「、」区切りで入力してください: ");
        String line = sc.nextLine();

        String[] items = line.split("[、,]");
        Random rand = new Random();

        int tvStock = rand.nextInt(12);
        int displayStock = 11 - tvStock;

        for (String raw : items) {
            String item = raw.trim();

            switch (item) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(item + "の残り台数は " + rand.nextInt(12) + "台です");
                    break;

                case "テレビ":
                case "ディスプレイ":
                    int stock = item.equals("テレビ") ? tvStock : displayStock;
                    System.out.println(item + "の残り台数は " + stock + "台です");
                    break;

                default:
                    System.out.println("『" + item + "』は指定の商品ではありません");
            }
        }

        sc.close();
    }
}


