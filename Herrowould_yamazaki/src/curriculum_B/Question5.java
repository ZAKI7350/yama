package curriculum_B;

public class Question5 {
	package curriculum.b;

	public class Question5 {

	    public static void main(String[] args) {
	        // Q1
	        helloWorld();
	        System.out.println();

	        // Q2
	        int base = 10;
	        int doubled = doubleValue(base);
	        System.out.println(base + " を 2 倍すると " + doubled + " です。");
	        System.out.println();

	        // Q3
	        int num1 = 7;
	        int num2 = 10;

	        System.out.println(num2 + (isEven(num2) ? " は偶数です。" : " は奇数です。"));
	        System.out.println(num1 + (isEven(num1) ? " は偶数です。" : " は奇数です。"));
	    }

	    // Q1: 引数なし / 戻り値なし / "Hello, World!" を表示
	    public static void helloWorld() {
	        System.out.println("Hello, World!");
	    }

	    // Q2: 引数(int num) / 戻り値：引数の2倍
	    public static int doubleValue(int num) {
	        return num * 2;
	    }

	    // Q3: 偶数ならtrue、奇数ならfalse
	    public static boolean isEven(int num) {
	        return num % 2 == 0;
	    }
	    package curriculum.b;

	    public class Greeting {

	        public void sayHello() {
	            System.out.println("こんにちは！");
	        }
	    }
	    public class Animal {

	        // フィールド
	        private String name;   // 動物名
	        private double length; // 体長(m)
	        private int speed;     // 速度(km/h)

	        // getter / setter（this を使う）
	        public String getName() {
	            return name;
	        }

	        public void setName(String name) {
	            this.name = name;
	        }

	        public double getLength() {
	            return length;
	        }

	        public void setLength(double length) {
	            this.length = length;
	        }

	        public int getSpeed() {
	            return speed;
	        }

	        public void setSpeed(int speed) {
	            this.speed = speed;
	        }
	    }
	    package curriculum.b;

	    public class Main2 {

	        public static void main(String[] args) {
	            Animal animal = new Animal();

	            // setterで値設定
	            animal.setName("ライオン");
	            animal.setLength(2.1);
	            animal.setSpeed(80);

	            // getterで出力
	            System.out.println("動物名：" + animal.getName());
	            System.out.println("体長：" + animal.getLength() + "m");
	            System.out.println("速度：" + animal.getSpeed() + "km/h");
	        }
	    }
	}