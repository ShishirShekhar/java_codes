import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        // Create a new label
        JLabel myLabel = new JLabel("Hello, world!");

        // Set the label to be centered
        myLabel.setHorizontalAlignment(JLabel.CENTER);
        myLabel.setVerticalAlignment(JLabel.CENTER);
        
        // Add the label to the frame
        add(myLabel);

        // Set the frame properties
        setTitle("My Frame");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
