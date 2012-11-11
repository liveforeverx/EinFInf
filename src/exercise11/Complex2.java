package exercise11;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable; // Import-Anweisung für unser JLabel

public class Complex2 {

    final static double OP = 1.0e-9; // Math.pow(10.0, -9), bleibt unverändert,
                                     // double Zahlen (10er Potenzen)

    static String format(double Sec) {
        if (Sec > 31104000)
            return Sec / 31104000 + " years";
        if (Sec > 2592000)
            return Sec / 2592000 + " month";
        if (Sec > 86400)
            return Sec / 86400 + " days";
        if (Sec > 3600)
            return Sec / 3600 + " hours";
        if (Sec > 60)
            return Sec / 60 + " minutes";
        return Sec + " seconds";
    }

    public static void main(String[] args) {

        String[][] rowData = new String[6][10]; // 6 Zeilen 10 Spalten aus
                                                // Strings // zweidimensionalen
                                                // Array Display
        rowData[0][0] = "A1: t1(n) = ld n(ld n = log2 n) ";
        rowData[1][0] = "A2: t2(n) = n ";
        rowData[2][0] = "A3: t3(n) = n*ld n ";
        rowData[3][0] = "A4: t4(n) = n^2";
        rowData[4][0] = "A5: t5(n) = n^3";
        rowData[5][0] = "A6: t6(n) = 2^n";
        for (int k = 1; k < 10; k++) {
            double n = Math.pow(2.0, k);
            rowData[0][k] = format((Math.log(n) / Math.log(2.0)) * OP);
            rowData[1][k] = format((n) * OP);
            rowData[2][k] = format((n * Math.log(n) / Math.log(2.0)) * OP);
            rowData[3][k] = format(n * n * OP);// Insertion/Selection/Bubble-sort
            rowData[4][k] = format(n * n * n * OP);
            rowData[5][k] = format(Math.pow(2.0, n) * OP);
        }

        // Spaltennamen
        String[] columnNames = { "Algorithmus", "2", "4", "8", "16", "32",
                "64", "128", "256", "512" };
        // Erzeugung eines neuen Frames mit dem
        JFrame frame = new JFrame("Komplexität");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// der Methode
                                                             // setDefaultCloseOperation
                                                             // wird die
                                                             // Konstante
                                                             // JFrame.EXIT_ON_CLOSE
                                                             // übergeben.
        // diese sorgt dafür, dass das komplette Programm beendet wird, wenn man
        // das Fenster schließt
        JTable table = new JTable(rowData, columnNames);// Erzeugen der
                                                        // zweidimensionale
                                                        // Tabellendaten
        // Ein JScrollPane dient dazu, Komponenten anzuzeigen, deren Ausmaße zu
        // groß für die Oberfläche sind.
        frame.add(new JScrollPane(table)); // * Hinzufügen einer einfachen
                                           // Komponente: JScrollPane
        frame.setSize(1250, 145);
        frame.setVisible(true); // das Fenster wird angezeigt

    }

}
