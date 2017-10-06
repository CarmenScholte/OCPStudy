package chapter02;

/**
 * Created by Carmen on 1-10-2017.
 */
public class Eagle implements Fly {

    public int getWingSpan() {
        return 15;
    }

    public void land() {
        System.out.println("Eagle is diving fast");
    }
}
