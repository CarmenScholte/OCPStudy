package chapter01;

/**
 * Created by Carmen on 30-9-2017.
 */
public class Person {

    private int socialSecurityNumber = 12345;

    public class TalkativePerson {

        public int stolenSecurityNumber() {
            return socialSecurityNumber;
        }

    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return this.socialSecurityNumber == person.socialSecurityNumber;
    }
}
