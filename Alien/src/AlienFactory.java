import java.util.Random;

public class AlienFactory {
    static final Random r = new Random();
    enum type {SQUID, RAT, TIGER, MONKEY};
    public Alien getAlien(){
        int rand = r.nextInt(type.values().length);
        type t = type.values()[rand];
        Alien answer = null;

        switch (t) {
            case SQUID:
                answer = new SquidAlien();
                break;
            case RAT:
                answer = new RatAlien();
                break;
            case TIGER:
                answer = new TigerAlien();
                break;
            case MONKEY:
                answer = new MonkeyAlien();
                break;

        }
        return answer;
    }
}
