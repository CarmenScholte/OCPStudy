package chapter01.cat;

/**
 * Created by Carmen on 30-9-2017.
 */
public class BigCat {

    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;

    public void example() {
        BigCat cat = new BigCat();
        System.out.println(cat.name);       // compiles, public access
        System.out.println(cat.hasFur);     // compiles, protected access, same package
        System.out.println(cat.hasPaws);    // only compiles in classes in this package
        System.out.println(cat.id);         // only compiles in this class, because id is private class member

    }
}
