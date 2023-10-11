import java.util.Random;

public class Alien {
    private final String NAME;
    static final Random r = new Random();

    public Alien(String type){
        this.NAME = type + r.nextInt(100);
    }

    public String getName() {
        return this.NAME;
    }

    @Override public String toString(){
        return this.NAME;
    }
}
