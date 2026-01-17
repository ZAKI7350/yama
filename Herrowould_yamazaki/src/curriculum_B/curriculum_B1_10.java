package curriculum_B;

import java.util.Scanner;

public class curriculum_B1_10 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // Q1
	        int scoreQ1 = 75;
	        if (scoreQ1 >= 60) {
	            System.out.println("合格です！");
	        }
	        System.out.println();
	        // Q2
	        int ageQ2 = 25;
	        if (ageQ2 >= 20 && ageQ2 <= 30) {
	            System.out.println("適正年齢です");
	        } else {
	            System.out.println("対象外です");
	        }
	        System.out.println();
	        // Q3
	        int ageQ3 = 18;
	        if (ageQ3 >= 20) {
	            System.out.println("成人です");
	        } else if (ageQ3 >= 13 && ageQ3 <= 19) {
	            System.out.println("ティーンエイジャーです");
	        } else {
	            System.out.println("子供です");
	        }
	        System.out.println();
	        // Q4
	        int x = 30, y = 15, z = 50;
	        int max = x;
	        if (y > max) max = y;
	        if (z > max) max = z;
	        System.out.println("最大値: " + max);
	        System.out.println();
	        // Q5
	        System.out.print("Q5 num を入力してください: ");
	        int num = sc.nextInt();
	        if (num > 0) {
	            System.out.println("正の数です");
	        } else if (num == 0) {
	            System.out.println("0です");
	        } else {
	            System.out.println("負の数です");
	        }
	        System.out.println();
	        // Q6（コンソール入力）
	        System.out.print("Q6 value を入力してください: ");
	        int value = sc.nextInt();
	        if (value % 2 == 0) {
	            System.out.println("偶数です");
	        } else {
	            System.out.println("奇数です");
	        }
	        System.out.println();
	        // Q7
	        int scoreQ7 = sc.nextInt();
	        if (scoreQ7 >= 90) {
	            System.out.println("優");
	        } else if (scoreQ7 >= 70) {
	            System.out.println("良");
	        } else if (scoreQ7 >= 50) {
	            System.out.println("可");
	        } else {
	            System.out.println("不可");
	        }
	        System.out.println();
	        sc.nextLine();
	        // Q8
	        System.out.print("Q8 文字列を入力してください（空でEnterも可）: ");
	        String input = sc.nextLine();
	        if (input == null || input.trim().isEmpty()) {
	            System.out.println("入力が無効です");
	        } else {
	            System.out.println("入力: " + input);
	        }
	        System.out.println();
	        // Q9
	        System.out.print("Q9 day(1〜7) を入力してください: ");
	        int day = sc.nextInt();
	        switch (day) {
	            case 1:
	                System.out.println("月曜日");
	                break;
	            case 2:
	                System.out.println("火曜日");
	                break;
	            case 3:
	                System.out.println("水曜日");
	                break;
	            case 4:
	                System.out.println("木曜日");
	                break;
	            case 5:
	                System.out.println("金曜日");
	                break;
	            case 6:
	                System.out.println("土曜日");
	                break;
	            case 7:
	                System.out.println("日曜日");
	                break;
	            default:
	                System.out.println("無効な入力です");
	                break;
	        }
	        System.out.println();
	        // Q10
	        System.out.print("Q10 month(1〜12) を入力してください: ");
	        int month = sc.nextInt();
	        switch (month) {
	            case 12:
	            case 1:
	            case 2:
	                System.out.println("冬");
	                break;
	            case 3:
	            case 4:
	            case 5:
	                System.out.println("春");
	                break;
	            case 6:
	            case 7:
	            case 8:
	                System.out.println("夏");
	                break;
	            case 9:
	            case 10:
	            case 11:
	                System.out.println("秋");
	                break;
	            default:
	                System.out.println("無効な月です");
	                break;
	        }
	        sc.close();
	    }
	}

