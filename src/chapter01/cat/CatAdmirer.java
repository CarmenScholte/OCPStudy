package chapter01.cat;

/**
 * Created by Carmen on 30-9-2017.
 */
public class CatAdmirer {

    public void example() {
        BigCat cat = new BigCat();
        System.out.println(cat.name);           // compiles, public access
        System.out.println(cat.hasFur);         // compiles, protected but in the same package
        System.out.println(cat.hasPaws);        // compiles, default access from the same package
//        System.out.println(cat.id);           // does not compile, id is private in BigCat
    }

}
