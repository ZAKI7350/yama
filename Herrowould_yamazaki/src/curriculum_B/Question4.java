package curriculum_B;



import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        // Q1
    	
        int[] A1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < A1.length; i++) {
            System.out.println(A1[i]);
        }

        System.out.println();

        
        
        
        // Q2
        int[] A2 = {10, 20, 30, 40, 50};
        for (int i = A2.length - 1; i >= 0; i--) {
            System.out.println(A2[i]);
        }
        System.out.println();

        
        
        
        // Q3
        int[] A3 = {3, 5, 7, 9, 11};
        int sumQ3 = 0;
        for (int i = 0; i < A3.length; i++) {
            sumQ3 += A3[i];
        }
        System.out.println("合計値: " + sumQ3);
        System.out.println();

        
        
        
        // Q4
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

        
        
        
        // Q5
        int[] A5 = {1, 2, 3, 4, 5};
        for (int i = 0; i < A5.length; i++) {
            A5[i] *= 2;
        }
        for (int v : A5) {
            System.out.println(v);
        }
        System.out.println();

        
        
        // Q6
        int[] A6 = {4, 7, 10, 15, 20};
        Scanner sc = new Scanner(System.in);

        System.out.print("Q6: 数値を入力してください: ");
        int input = sc.nextInt();

        boolean found = false;
        for (int v : A6) {
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

        
        
        
        // Q7
        int[][] q7 = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < q7.length; i++) {
            for (int j = 0; j < q7[i].length; j++) {
                System.out.println(q7[i][j]);
            }
        }
        System.out.println();

        
        
        
        
        // Q8:
        int[][] A8 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int sumQ8 = 0;
        for (int i = 0; i < A8.length; i++) {
            for (int j = 0; j < A8[i].length; j++) {
                sumQ8 += A8[i][j];
            }
        }
        System.out.println("合計値: " + sumQ8);
        System.out.println();

        
        
        
        
        // Q9
        int[][] A9 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
        int maxQ9 = A9[0][0];
        int minQ9 = A9[0][0];

        for (int i = 0; i < A9.length; i++) {
            for (int j = 0; j < A9[i].length; j++) {
                int v = A9[i][j];
                if (v > maxQ9) maxQ9 = v;
                if (v < minQ9) minQ9 = v;
            }
        }

        System.out.println("最大値: " + maxQ9);
        System.out.println("最小値: " + minQ9);
        System.out.println();

        
        
        
        
        // Q10
        int[][][] A10 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        for (int i = 0; i < A10.length; i++) {
            for (int j = 0; j < A10[i].length; j++) {
                for (int k = 0; k < A10[i][j].length; k++) {
                    System.out.println(A10[i][j][k]);
                }
            }
        }

        sc.close();
    }
}