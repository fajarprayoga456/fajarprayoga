package guidua;

import javax.swing.*;

public class RunBiodata {
    public static void main(String[] args) {
        JFrame x = new JFrame("Aplikasi Biodata Berdasarkan NIM");
        x.setContentPane(new Biodata().getRootPanel());
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setLocationRelativeTo(null);
        x.setSize(500,400);
        x.setVisible(true);
    }
}
