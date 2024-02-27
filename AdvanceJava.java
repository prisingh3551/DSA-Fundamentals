
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class AdvanceJava {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Demo of Scroll Pane ....");
        jf.setBounds(100, 100, 500, 600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        Font f = new Font("Arial", Font.ITALIC, 24);

        JTextArea ta = new JTextArea(5, 20);
        ta.setBounds(100, 100, 400, 500);
        ta.setFont(f);
        ta.setBackground(Color.gray);
        ta.setForeground(Color.green);

        JScrollPane jsp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jf.add(jsp);

        String []s = {"Tea", "Coffee", "Momos", "Samosa", "Pizza", "Tea", "Coffee", "Momos", "Samosa", "Pizza"};
        JList<String> jl = new JList<>(s);
        jl.setFont(f);

        JScrollPane jsp2 = new JScrollPane(jl);
        jsp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jsp2.setBounds(500, 100, 200, 50);
        jf.add(jsp2);

        jf.setVisible(true);
    }
}
