package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Billable型でリスト作成
        List<Billable> list = new ArrayList<>();

        // 社員を追加
        list.add(new FullTimeEmploye("F001", "山田太郎"));
        list.add(new ContractEmploye("C001", "佐藤花子"));
        list.add(new FullTimeEmploye("F002", "鈴木一郎"));

        int hours = 9;

        // for-each
        for (Billable b : list) {
            System.out.println("日給: " + b.costForDay(hours) + "円");
        }
    }
}