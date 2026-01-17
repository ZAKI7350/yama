package curriculum_B;
public class animal {
    // フィールド（変数）
    private String name;   // 動物名
    private double length; // 体長（m）
    private int speed;     // 速度（km/h）

    // name の setter
    public void setName(String name) {
        this.name = name;
    }

    // length の setter
    public void setLength(double length) {
        this.length = length;
    }

    // speed の setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // name の getter
    public String getName() {
        return this.name;
    }

    // length の getter
    public double getLength() {
        return this.length;
    }

    // speed の getter
    public int getSpeed() {
        return this.speed;
    }
}
