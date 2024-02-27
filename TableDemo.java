
import javax.swing.*;

import java.awt.*;

public class TableDemo{
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(800, 600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // String col[] = {"Roll no. ", "Name", "Age"};
        // String data[][] = {
        //     {"B67", "Sapna", "20"},
        //     {"B36", "Isha", "20"},
        //     {"B35", "CV", "20"},
        //     {"A09", "Shubham", "20"},
        //     {"B48", "Priya", "20"}
        // };
        // JTable table = new JTable(data, col);
        // table.setRowHeight(40);
        // jf.add(new JScrollPane(table));

        // // object - any type of value can be passed
        // Object col[] = {"Roll no. ", "Name", "Age"};
        // Object data[][] = {
        //     {67, "Sapna", 20},
        //     {"B36", "Isha", 20},
        //     {35, "CV", 20},
        //     {"A09", "Shubham", 20},
        //     {"B48", "Priya", 20}
        // };
        // DefaultTableModel m = new DefaultTableModel(data, col);
        // JTable jt = new JTable(m);
        // jt.setRowHeight(50);
        // jf.add(new JScrollPane(jt));

        Object col[] = {"Time Day", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Object data[][] = {
            {"9-10"},
            {"10-11"},
            {"11-12"},
            {"12-1","CAP"},
            {"1-2"},
            {"2-3","","CP","PES"},
            {"3-4"},
            {"4-5"}
        };
        JTable jt = new JTable(data, col);
        jt.setRowHeight(50);
        jf.add(new JScrollPane(jt));

        jf.setVisible(true);
    }
}