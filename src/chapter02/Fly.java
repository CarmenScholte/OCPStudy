package chapter02;

/**
 * Created by Carmen on 1-10-2017.
 */
public interface Fly {

    public int getWingSpan() throws Exception;   // all methods are implicitly public and abstract

    public static final int MAX_SPEED = 100;     // all variables in an instance are automatically public static and final

    public default void land() {
        System.out.println("Animal is landing"); // when declared default, an interface can implement method
    }

    public static double calculateSpeed(float distance, double time) {
        return distance / time;
    }
}
