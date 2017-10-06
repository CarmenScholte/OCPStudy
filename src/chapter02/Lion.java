package chapter02;

/**
 * Created by Carmen on 1-10-2017.
 */
public class Lion implements Run {

    public boolean isQuadruped() {
        return true;
    }

    public boolean canHuntWhileRunning() {
        return true;
    }

    public double getMaxSpeed() {
        return 100;
    }
}
