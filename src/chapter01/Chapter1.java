package chapter01;

import chapter01.cat.BobCat;
import chapter01.cat.BobCatKitten;

/**
 * Created by Carmen on 30-9-2017.
 */
public class Chapter1 {

    public static void chapterOneExample() {

        BobCat bobCat = new BobCat();
        BobCat bobKitten = new BobCatKitten();
        BobCatKitten bobCatKitten = new BobCatKitten();

        bobCat.findDen();
        bobKitten.findDen();        // at runtime findDen() in BobCatKitten is called,
                                    // at runtime first the BobCat constructor is called, then the BobCatKitten constructor.
        bobCatKitten.findDen();     // at runtime findDen() in BobCatKitten is called,
                                    // at runtime first the BobCat constructor is called, then the BobCatKitten constructor.

        bobCat.getSibbling();
        bobKitten.getSibbling();
        bobCatKitten.getSibbling();

        System.out.println(bobCat instanceof BobCat);
        System.out.println(bobKitten instanceof BobCat);
        System.out.println(bobCatKitten instanceof BobCat);

        System.out.println(bobCat instanceof BobCatKitten);
        System.out.println(bobKitten instanceof BobCatKitten);
        System.out.println(bobCatKitten instanceof BobCatKitten);

        bobCat.printName();
        bobCatKitten.printName();
        bobKitten.printName();

        bobCat.feedBobCat();
        bobKitten.feedBobCat();
        bobCatKitten.feedBobCat();

        for(Season season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        if(null instanceof BobCat) {

        }

        Person person = new Person();
        Person.TalkativePerson talkPers = person.new TalkativePerson();
        System.out.println(talkPers.stolenSecurityNumber());

        Outer outer = new Outer();
        outer.calculate();
    }

}
