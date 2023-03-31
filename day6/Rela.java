public class Rela {
    public static int a, b;

    public static void main(String[] args) {
        a = 10;
        b = 20;

        boolean t = true;
        boolean f = false;

        System.out.println("a == b -> " + (a == b));
        System.out.println("a != b -> " + (a != b));
        System.out.println("a > b ->"  + (a > b));
        System.out.println("a < b ->"  + (a < b));
        System.out.println("a >= b -> " + (a >= b));
        System.out.println("a <= b -> " + (a <= b));
        System.out.println("f | t -> " + (f | t));
        System.out.println("f & t -> " + (f & t));
        System.out.println("f ^ t -> " + (f ^ t));
        System.out.println("(!f & t) | (f & !t) -> " + ((!f & t) | (f & !t)));
        System.out.println("!f -> " + !f);
    }
}

