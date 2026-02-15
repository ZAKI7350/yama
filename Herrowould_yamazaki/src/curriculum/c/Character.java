package curriculum.c;
public class Character {

    protected String name;
    protected int hp;
    protected int at;
    protected int sp;

    public Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
    }

    public void attack(Character opponent) {
        opponent.hp -= this.at;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String getStatus() {
        return name + " HP:" + hp + " AT:" + at + " SP:" + sp;
    }
}