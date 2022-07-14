import java.util.Random;

public class Head {
    public static void main(String[] args) {
        int h = 0;
        int t = 0;
        Random rand = new Random();
        System.out.println("Tossing a coin...");
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(2);
            if (num == 0) {
                h++;
                System.out.println("Round" + i + ": Heads");
            } else if (num == 1) {
                t++;
                System.out.println("Round" + i + ": Tails");
            }
        }
        System.out.println("Heads:" + h + ", Tails:" + t);
        if (h > t) {
            System.out.println("You won!");
        }
    }

}