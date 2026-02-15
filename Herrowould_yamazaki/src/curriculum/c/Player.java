package curriculum.c;
import java.util.Random;

public class Player extends Character {

    public Player(String name) {
        super(name,
                new Random().nextInt(41) + 60, // HP 60〜100
                new Random().nextInt(11) + 10, // AT 10〜20
                new Random().nextInt(11) + 5   // SP 5〜15
        );
    }
}