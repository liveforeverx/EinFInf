package exercise11;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Complex extends JFrame {

    private static final long serialVersionUID = 1L;
    final static double OP = 1.0e-9;

    Complex(){
        super("Complex");
    }
    
    public static void main(String[] args) {
        new Complex().createGUI();
    }
    
    public void createGUI(){
        String[][] row = initializeData();
        String[] columnNames = { "Algorithm", "n = 2", "n = 4", "n = 8", "n = 16", "n = 32",
                "n = 64", "n = 128", "n = 256", "n = 512" };
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = new JTable(row, columnNames);
        add(new JScrollPane(table));
        setSize(1250, 145);
        setVisible(true);
    }

    private String[][] initializeData() {
        String[][] row = new String[6][10];
        row[0][0] = "t1(n) = ld n(ld n = log2 n) ";
        row[1][0] = "t2(n) = n ";
        row[2][0] = "t3(n) = n*ld n ";
        row[3][0] = "t4(n) = n^2";
        row[4][0] = "t5(n) = n^3";
        row[5][0] = "t6(n) = 2^n";
        for (int k = 1; k < 10; k++) {
            double n = Math.pow(2.0, k);
            row[0][k] = format((Math.log(n) / Math.log(2.0)) * OP);
            row[1][k] = format((n) * OP);
            row[2][k] = format((n * Math.log(n) / Math.log(2.0)) * OP);
            row[3][k] = format(n * n * OP);
            row[4][k] = format(n * n * n * OP);
            row[5][k] = format(Math.pow(2, n) * OP);
        }
        return row;
    }
   
    private String format(double Sec){
        if(Sec > 31104000) return Sec/31104000 + " years";
        if(Sec > 2592000) return Sec/2592000 + " month";
        if(Sec > 86400) return Sec/86400 + " days";
        if(Sec > 3600) return Sec/3600 + " hours";
        if(Sec > 60) return Sec/60 + " minutes";
        return Sec + " seconds";
    }
    
}
