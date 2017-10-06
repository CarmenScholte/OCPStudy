package chapter01;

/**
 * Created by Carmen on 30-9-2017.
 */
public class Browsers {

    static class Browser {
        public static void go() {
            System.out.println("Broswer GO!");
        }
    }

    static class Firefox extends Browser {
        public static void go() {
            System.out.println("Broswer GO!");
        }
    }

    static class IE extends Browser {
        public static void go() {
            System.out.println("Broswer GO!");
        }
    }

    public static void main(String[] args) {
        Browser b = new Firefox();
        IE ie = (IE) b;
        ie.go();
    }
}
