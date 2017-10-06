package chapter01.cat;

/**
 * Created by Carmen on 30-9-2017.
 */
public class BobCat {

    String name = "Bob";

    public void feedBobCat() {
        System.out.println("feeding BobCat");
    }

    public void printName() {
        System.out.println(name);
    }

    public BobCat() {
        System.out.println("BobCat -- Constructor");
    }

    public void findDen() {
        System.out.println("BobCat -- findDen()");
    }

    public static Integer getSibbling() {
        System.out.println(100);
        return new Integer(42);
    }

}
