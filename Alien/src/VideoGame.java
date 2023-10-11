import java.util.Random;

public class VideoGame {
    private static final int ALIENGANG = 10;
    public void play(){
        // create an array of 10 aliens and print them
        AlienFactory af = new AlienFactory();
        Alien[] aliens = new Alien[ALIENGANG];
        for(int i = 0; i < ALIENGANG; i++){
            aliens[i] = af.getAlien();
        };
        for(Alien a : aliens){
            System.out.println(a);

        }
    }
}
