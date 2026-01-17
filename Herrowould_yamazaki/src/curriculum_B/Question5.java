package curriculum_B;

public class Question5 {
	public static void main(String[] args) {
        // Animalクラスのインスタンスを生成
        animal animal = new animal();

        // 値を設定（setter使用）
        animal.setName("ライオン");
        animal.setLength(2.1);
        animal.setSpeed(80);

        // 値を取得して表示（getter使用）
        System.out.println("動物名：" + animal.getName());
        System.out.println("体長：" + animal.getLength() + "m");
        System.out.println("速度：" + animal.getSpeed() + "km/h");
    }
	    
}  
