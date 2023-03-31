public class Return {
    public String add() {
        int x = 30;
        int y = 70;
        int z = x + y;

        return "The sum of two number are " + z;
    };

    public static void main(String[] args) {
        Return test = new Return();
        String add = test.add();
        System.out.println(add);
    }
}
