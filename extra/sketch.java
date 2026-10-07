import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(50, 100, 200, 50);
        g.drawRect(50, 100, 150, 100);
        g.drawOval(250, 100, 100, 100);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");

        frame.add(new Drawing());
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}