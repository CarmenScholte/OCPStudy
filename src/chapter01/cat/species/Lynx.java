package chapter01.cat.species;

import chapter01.cat.BigCat;

/**
 * Created by Carmen on 30-9-2017.
 */
public class Lynx extends BigCat {

    public void example() {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
//        System.out.println(cat.hasFur);     // protected access, Lynx is a child of BigCat, but the method is called on the variable, not by inheritance
//        System.out.println(cat.hasPaws);    // default access, Lynx is not in same package as BigCat
//        System.out.println(cat.id);         // id is private

        BigCat fastCat = new Lynx();
//        System.out.println(fastCat.hasFur);  // protected access, Lynx is a child of BigCat, but fastCat is a BigCat reference which protected methods cannot be called here.

        Lynx lynx = new Lynx();
        System.out.println(lynx.hasFur);     // protected access, Lynx is a child of BigCat, since Lynx is referenced as a Lynx it can use protected access methods, compiles fine.
    }
}
