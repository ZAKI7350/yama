package curriculum_B;

public abstract class Employee {
    private String employeeId;
    private String name;

    // コンストラクタ
    public Employee(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    // ゲッター
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // 抽象メソッド（サブクラスで実装）
    public abstract int calculateDailyWage(int hoursWorked);
}

