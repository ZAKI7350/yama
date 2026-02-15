package jikosyoukai;
public class Main {
public static void main(String[] args) {

    // 問題5：weight に 60 を入れる
    Person p1 = new Person("山崎遼", 29, 1.6, 45);
    

    // 情報表示
    p1.print();
  

    // 合計人数表示
    Person.printCount();
}
}