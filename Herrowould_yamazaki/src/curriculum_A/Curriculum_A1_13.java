package curriculum_A;

public class Curriculum_A1_13 {
	 public static void main(String[] args) {

	     //Q1
	        byte byteNum = 0;
	        short shortNum = 0;
	        int intNum = 0;
	        long longNum = 0L;
	        float floatNum = 0.0f;
	        double doubleNum = 0.0;
	        char letter = '\0';
	        String letters = "";
	        boolean isBoolean = false;
	        // Q2
	        byteNum = 10;
	        shortNum = 100;
	        intNum = 1000;
	        longNum = 10000L;
	        floatNum = 9.5f;
	        doubleNum = 10.5;
	        letter = 'a';
	        letters = "ハロー";
	        isBoolean = true;
	        // Q3
	        int sumIntTypes = byteNum + shortNum + intNum + (int) longNum;
	        System.out.println(sumIntTypes);
	        int twenty = byteNum + (int) doubleNum;
	        System.out.println(twenty);
	        System.out.println(letter + " " + letters + " " + isBoolean);
	        int allAdd = sumIntTypes + twenty;
	        System.out.println(allAdd);
	        long multiply = (long) byteNum * (long) shortNum * (long) intNum * longNum;
	        System.out.println(multiply);
	        System.out.println(doubleNum / 100);
	        System.out.println(byteNum - shortNum);
	        System.out.println();
	        // Q4
	        String name = "山田太郎";
	        System.out.println("こんにちは、" + name + "さん！");
	        System.out.println();
	        int age = 25;
	        System.out.println("年齢: " + age + "歳");
	        System.out.println();
	        // Q6
	        int num1 = 10;
	        int num2 = 5;
	        int sum = num1 + num2;
	        System.out.println(sum);
	        System.out.println();
	        // Q7
	        int score = 80;
	        score += 20;
	        System.out.print("");
	        // Q8
	        double price = 99.99;
	        int intPrice = (int) price;
	        System.out.println("整数価格: " + intPrice);
	        System.out.println();
	        // Q9
	        String numStr = "123";
	        int parsedNum = Integer.parseInt(numStr);
	        System.out.println("変換後の値: " + (parsedNum + 10));
	        System.out.println();
	        // Q10
	        int num = 50;
	        String numText = String.valueOf(num);
	        System.out.println("得点: " + numText + "点");
	        System.out.println();
	        // Q11
	        int a = 10;
	        int b = 20;
	        boolean result = (a < b) ? true : false;
	        System.out.println(result);
	        System.out.println();
	        // Q12
	        int x = 15;
	        String judge = (x >= 10) ? "OK" : "NG";
	        System.out.println(judge);
	        System.out.println();
	        // Q13
	        String text = "私はJavaが好きです。Javaは楽しい！";
	        System.out.println(text.replace("Java", "Python"));
	    }
	}

