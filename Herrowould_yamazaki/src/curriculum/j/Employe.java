package curriculum.j;
public abstract class Employe implements Billable {

    protected String id;
    protected String name;

    // コンストラクタ
    public Employe(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // costForDay は実装しない（抽象のまま）
    @Override
    public abstract int costForDay(int hoursWorked);
}
