import java.util.*;
import java.lang.*;
import java.io.*;

public class If2 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Creation ");
            }
        }).start();
    }
}
