package curriculum_B;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        int[] numbers = {4, 7, 10, 15, 20};

        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力してください：");
        int input = scanner.nextInt();

        boolean found = false; // 見つかったかどうかのフラグ

        // 配列の中をチェック
        for (int num : numbers) {
            if (num == input) {
                found = true;
                break;
            }
        }

        // 結果を表示
        if (found) {
            System.out.println("結果：" + input + " は配列に含まれています。");
        } else {
            System.out.println("結果：" + input + " は配列に含まれていません。");
        }

        scanner.close();
    }
}//package curriculum_B;
//import java.util.Scanner;
//public class Question4 {
	// public static void main(String[] args) {
		// int[] numbers = {4, 7, 10, 15, 20};

	      //  Scanner scanner = new Scanner(System.in);
	        //System.out.print("数値を入力してください：");
	        //int input = scanner.nextInt();

	        //boolean found = false; // 見つかったかどうかのフラグ

	        // 配列の中をチェック
	        //for (int num : numbers) {
	           // if (num == input) {
	             //   found = true;
	               // break;
	            //}
	        //}

	        // 結果を表示
	        //if (found) {
	           // System.out.println("結果：" + input + " は配列に含まれています。");
	        //} else {
	           // System.out.println("結果：" + input + " は配列に含まれていません。");
	        //}
    //}
//}

