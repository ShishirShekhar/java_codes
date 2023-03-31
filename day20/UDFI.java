import java.util.*;
import java.lang.*;
import java.io.*;

interface Mul {
    int Compute(int a, int b);

    static void info() {
        System.out.println("This is a static method in the Mul interface.");
    }

    default void result(int res) {
        System.out.println("The result is: " + res);
    }
}

interface Add {
    int Compute(int a, int b);

    static void info() {
        System.out.println("This is a static method in the Add interface.");
    }

    default void result(int res) {
        System.out.println("The result is: " + res);
    }
}

class UDFI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        Mul mul = (int a, int b) -> a*b;
        Add add = (int a, int b) -> a+b;

        Mul.info();
        Add.info();

        int res1 = mul.Compute(n1, n2);
        int res2 = add.Compute(n1, n2);

        mul.result(res1);
        add.result(res2);
    }
}
