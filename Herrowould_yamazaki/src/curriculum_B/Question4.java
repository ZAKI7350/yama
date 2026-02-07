package curriculum_B;

import java.util.Scanner;

ppackage curriculum.b;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        // --------------------
        // Q1: {1,2,3,4,5} を作って順番に表示
        // --------------------
        int[] q1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < q1.length; i++) {
            System.out.println(q1[i]);
        }
        System.out.println();

        // --------------------
        // Q2: {10,20,30,40,50} を逆順に表示
        // --------------------
        int[] q2 = {10, 20, 30, 40, 50};
        for (int i = q2.length - 1; i >= 0; i--) {
            System.out.println(q2[i]);
        }
        System.out.println();

        // --------------------
        // Q3: {3,5,7,9,11} の合計を表示
        // --------------------
        int[] q3 = {3, 5, 7, 9, 11};
        int sumQ3 = 0;
        for (int i = 0; i < q3.length; i++) {
            sumQ3 += q3[i];
        }
        System.out.println("合計値: " + sumQ3);
        System.out.println();

        // --------------------
        // Q4: {12,7,9,21,5,18} の最大値と最小値
        // --------------------
        int[] q4 = {12, 7, 9, 21, 5, 18};
        int maxQ4 = q4[0];
        int minQ4 = q4[0];

        for (int i = 1; i < q4.length; i++) {
            if (q4[i] > maxQ4) maxQ4 = q4[i];
            if (q4[i] < minQ4) minQ4 = q4[i];
        }

        System.out.println("最大値: " + maxQ4);
        System.out.println("最小値: " + minQ4);
        System.out.println();

        // --------------------
        // Q5: {1,2,3,4,5} を2倍して表示（拡張for文で表示）
        // --------------------
        int[] q5 = {1, 2, 3, 4, 5};
        for (int i = 0; i < q5.length; i++) {
            q5[i] *= 2;
        }
        for (int v : q5) { // 拡張for文で表示
            System.out.println(v);
        }
        System.out.println();

        // --------------------
        // Q6: {4,7,10,15,20} に入力値が含まれるか判定
        // --------------------
        int[] q6 = {4, 7, 10, 15, 20};
        Scanner sc = new Scanner(System.in);

        System.out.print("Q6: 数値を入力してください: ");
        int input = sc.nextInt();

        boolean found = false;
        for (int v : q6) {
            if (v == input) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(input + "は配列に含まれています");
        } else {
            System.out.println(input + "は配列に含まれていません");
        }
        System.out.println();

        // --------------------
        // Q7: 2次元配列 {{1,2},{3,4},{5,6}} の全要素表示
        // --------------------
        int[][] q7 = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < q7.length; i++) {
            for (int j = 0; j < q7[i].length; j++) {
                System.out.println(q7[i][j]);
            }
        }
        System.out.println();

        // --------------------
        // Q8: 2次元配列の合計
        // --------------------
        int[][] q8 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int sumQ8 = 0;
        for (int i = 0; i < q8.length; i++) {
            for (int j = 0; j < q8[i].length; j++) {
                sumQ8 += q8[i][j];
            }
        }
        System.out.println("合計値: " + sumQ8);
        System.out.println();

        // --------------------
        // Q9: 2次元配列の最大値と最小値
        // --------------------
        int[][] q9 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
        int maxQ9 = q9[0][0];
        int minQ9 = q9[0][0];

        for (int i = 0; i < q9.length; i++) {
            for (int j = 0; j < q9[i].length; j++) {
                int v = q9[i][j];
                if (v > maxQ9) maxQ9 = v;
                if (v < minQ9) minQ9 = v;
            }
        }

        System.out.println("最大値: " + maxQ9);
        System.out.println("最小値: " + minQ9);
        System.out.println();

        // --------------------
        // Q10: 3次元配列の全要素表示
        // --------------------
        int[][][] q10 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        for (int i = 0; i < q10.length; i++) {
            for (int j = 0; j < q10[i].length; j++) {
                for (int k = 0; k < q10[i][j].length; k++) {
                    System.out.println(q10[i][j][k]);
                }
            }
        }

        sc.close();
    }
}
