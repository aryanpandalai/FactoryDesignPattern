import java.util.Random;

public class BetterAlienFactory {
    static final Random r = new Random();
    enum type {SquidAlien, RatAlien, TigerAlien, MonkeyAlien};
    public Alien getAlien(){
        int rand = r.nextInt(type.values().length);
        type t = type.values()[rand];
        Alien alien = null;
        try{
            alien = (Alien) (Class.forName(t.toString()).getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            System.out.println("Unknown Alien Type");
        }
        return alien;
    }
}
