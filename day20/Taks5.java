import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.event.*;  
import javax.swing.*;

public class Taks5 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 running");
            }
        });

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread 2 running");
            }
        };

        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });
        

        thread1.start();
        thread2.start();
    }
}
