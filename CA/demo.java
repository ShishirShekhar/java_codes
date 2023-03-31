public class demo {
    public static void main(String args []){
        StringBuffer a = new StringBuffer("Hello India");
        StringBuffer b = new StringBuffer("Hello World");
        StringBuffer c = new StringBuffer("Hello Java");

        System.out.print(a.delete(0, 6));
        System.out.print(b.delete(0, b.length()));
        System.out.print (c.delete(0, 1));
    }
}

