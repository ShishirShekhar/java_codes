public class Oper {
    public static int a, b, c;
    public static void main(String[] args) {
        a = 10;
        b = 20;
        c = 0;

        c = a + b;
        System.out.println("a+b=" + c);

        c -= a;
        System.out.println("c-=a = " + c);

        c = c * a;
        System.out.println("c *= a = " + c);
    }
}
