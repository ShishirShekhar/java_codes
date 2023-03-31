public class Inst {
    public static void main(String[] args) {
        String name = "Hello";
        boolean result1 = name instanseof String;
        System.out.println("name is the instance of String: " + result1);

        Inst obj = new Inst();
        boolean result2 = obj instanceof Inst;
        System.out.println("obj is the instance of Inst: " + result2);
    }
}
