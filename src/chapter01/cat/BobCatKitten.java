package chapter01.cat;

/**
 * Created by Carmen on 30-9-2017.
 */
public class BobCatKitten extends BobCat {

    String name = "Kitty";

    public void feedBobCat() {
        feedBobCatKitten();
    }

    void feedBobCatKitten() {
        System.out.println("Feeding BobCatKitten");
    }

    public BobCatKitten() {
        System.out.println("BobCatKitten -- Constructor");
    }

    @Override
    public void findDen() {
        System.out.println("BobCatKitten -- findDen()");    // Overridden from BobCat
    }

    public void findDen(boolean b) {
        System.out.println("BobCatKitten -- findDen(boolean)"); // Overloaded
    }


    public static Integer getSibbling() {
        System.out.println(42);
        return 42;
    }


}
