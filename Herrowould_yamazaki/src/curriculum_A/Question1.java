package curriculum_A;
public class Question1 {
	//String name = "山田 花子";
	//int age = 25;
	//String hobby = "映画鑑賞";

    public static void main(String[] args) {
        // 各データ型の変数を宣言して初期値を設定　
    	String name = "山田 花子";
    	int age = 25;
    	String hobby = "映画鑑賞";
        byte byteNum = 100;
        short shortNum = 10;
        int intNum = 25;
        long longNum = 10000L;
        float floatNum = 100;
        double doubleNum = 10.5;
        char letter = 'A';
        String letters = "年齢は";
        boolean isBoolean = true;
        
        // 各変数の値を出力
        
        System.out.println("私の名前は" + name +"です。");
        System.out.println("年齢:：" + age + "歳");
        System.out.println("趣味は" + hobby +"です。");
        System.out.println(  shortNum - byteNum);
        System.out.println("shortNum = " + shortNum);
        System.out.println("intNum = " + intNum);
        System.out.println( longNum * longNum);
        System.out.println( 10.5/floatNum);
        System.out.println("doubleNum = " + doubleNum);
        System.out.println("letter = " + letter);
        System.out.println("letters = " + letters+isBoolean);
        System.out.println("isBoolean = " + isBoolean);
        int num1 = 10;        // num1というint型の変数に10を代入
        int num2 = 5;         // num2というint型の変数に5を代入
        int sum = num1 + num2; // num1とnum2を足した結果をsumに代入
        System.out.println(sum); // コンソールに表示
        int score = 80;           // scoreというint型の変数に80を代入
        score = score + 20;       // scoreに20を加えて更新
        System.out.println("最終スコア: " + score); // scoreを使用して表示
        double price = 99.99;               // priceというdouble型の変数に99.99を代入
        int intPrice = (int) price;         // int型に変換してintPriceに代入
        System.out.println("整数価格: " + intPrice); // コンソールに表示
        int num = 50;       // numStrをint型に変換
        System.out.println("変換後の値: " + (num + 10)); // 変換後の値に10を足して表示
       
        String strNum = String.valueOf(num); // numをString型に変換
        System.out.println("得点: " + strNum + "点"); // 表示　
        int a = 10;                             // aに10を代入
        int b = 20;                             // bに20を代入
        boolean result = (a < b) ? true : false; // aがbより小さいかを条件演算子で判定
        System.out.println(result);  
       
            String text = "私はJavaが好きです。Javaは楽しい！";
            text = text.replace("Java", "Python");
            System.out.println(text);// 結果を表示
    }}

