public class Lambda2Arguments {
    interface Operation1 {
        int operation(int a, int b);
    }

    interface Operation2 {
        void message(String msg);
    }

    private int operate(int p, int q, Operation1 obj) {
        return obj.operation(p, q);
    }

    public static void main(String[] args) {
        Operation1 Add = (int x, int y) -> x + y;
        Operation1 Mul = (int x, int y) -> x * y;
        
        Lambda2Arguments lObj = new Lambda2Arguments();
        System.out.println("Addition is " + lObj.operate(900, 900, Add));
        System.out.println("Addition is " + lObj.operate(30, 60, Mul));

        Operation2 fObj = msg -> System.out.println("Hi Students " + msg);
        fObj.message("Let's Code");
    }
}
