class OuterClass {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

public class NS {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
