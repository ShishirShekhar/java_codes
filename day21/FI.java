public class FI {
    interface Operation1 {
        int operation(int a, int b);
    }

    interface Operation2 {
        String msg(int res);
    }

    private int operate(int p, int q, Operation1 obj) {
        return obj.operation(p, q);
    }

    public static void main(String[] args) {
        Operation1 Add = (int x, int y) -> x + y;
        Operation1 Sub = (int x, int y) -> x - y;
        Operation1 Mul = (int x, int y) -> x * y;
        Operation1 Div = (int x, int y) -> x / y;

        Operation2 print = (res) -> {
            switch (res) {
                case 1:
                return "one";
                case 2:
                return "two";
                case 3:
                return "three";
                case 4:
                return "four";
                case 5:
                return "five";
                case 6:
                return "six";
                case 7:
                return "seven";
                case 8:
                return "eight";
                case 9:
                return "nine";
                case 0:
                return "zero";
            }
            return "none";
        };

        FI obj = new FI();
        System.out.println("Add: " + print.msg(obj.operate(2, 2, Add)));
        System.out.println("Sub: " + print.msg(obj.operate(2, 2, Sub)));
        System.out.println("Mul: " + print.msg(obj.operate(2, 2, Mul)));
        System.out.println("Div: " + print.msg(obj.operate(2, 2, Div)));
    }
}
