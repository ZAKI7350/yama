package curriculum_B;

public class Question2 {
	public static void main(String[] args) {
	
		int score = 75; 
		if (score >= 60) {
			System.out.println("合格です！");
		}
	 	else if (score >= 60) {
	 		System.out.println("追試です");
	 	} else {
	 		System.out.println("不合格です");
	 	}
		int age = 18;

		if (age >= 20 && age <= 30) {
        System.out.println("適正年齢です");}
		
		else {
        System.out.println("対象外です");
        
        if (age >= 20) {
            System.out.println("成人です");
        } else if (age >= 13 && age <= 19) {
            System.out.println("ティーンエイジャーです");
        } else {
            System.out.println("子供です");
        }
        int x = 30;
        int y = 15;
        int z = 50;
        int max;

        if (x >= y && x >= z) {
            max = x;
        } else if (y >= x && y >= z) {
            max = y;
        } else {
            max = z;
        }
        System.out.println("一番大きい数値は " + max + " です。");
        String input = ""; // 例として空文字を代入（必要に応じて null や他の文字列に変更）

        if (input == null || input.isEmpty()) {
            System.out.println("入力が無効です");
        } else {
            System.out.println("入力された値: " + input);
        }
        int num = -5;  // 例として -5 を代入（必要に応じて変更）

        if (num > 0) {
            System.out.println("正の数です");
        } else if (num == 0) {
            System.out.println("0です");
        } else {
            System.out.println("負の数です");
        }
        int value = 8;  // 例として 7 を代入（必要に応じて変更）

        if (value % 2 == 0) {
            System.out.println("偶数です");
        } else {
        System.out.println("奇数です");
        }
        score = 60; // 0〜100 の範囲で好きな数値を代入

        if (score >= 80) {
            System.out.println("優");
        } else if (score >= 70) {
            System.out.println("良");
        } else if (score >= 50) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }   
        }
        

	 	int a = 10;
	 	int b = 5;
	 	if (a > b)
	 	{
	 		System.out.println("a は b より大きい");
	 	}
	 	if (a == 10) 
	 	{
	 	System.out.println("a は 10 です");
	 	
	 	boolean hasTicket = true;
	 	// AND（&&）：両方の条件を満たす場合
	 	if (age >= 18 && hasTicket)
	 	{
	 	System.out.println("入場できます");
	 	}// OR（||）：どちらかの条件を満たす場合
	 	if (age >= 18 || hasTicket)
	 	{
	 	System.out.println("一部の条件を満たしています");
	 	}// NOT（!）：条件を反転if (!hasTicket) {　
	 	System.out.println("チケットがありません");
	 	String result;
	 	if (score >= 80) {
	 	 result = "合格";
	 	} else {
	 	 result = "不合格";
	 	}
	 	System.out.println(result);
	 	}
	}
}
					
