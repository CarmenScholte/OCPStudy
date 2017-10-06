package chapter01.mouse;

import chapter01.cat.BigCat;

/**
 * Created by Carmen on 30-9-2017.
 */
public class Mouse {

    public void example() {
        BigCat cat = new BigCat();
        System.out.println(cat.name);       // public access, compiles
//        System.out.println(cat.hasFur);     // protected access, Moude is not in same package or a child of BigCat
//        System.out.println(cat.hasPaws);    // default access, Mouse is not in same package as BigCat
//        System.out.println(cat.id);         // id is private
    }

}
