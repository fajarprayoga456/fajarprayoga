package com.pemrogramanlanjut.gui;

import javax.swing.*;

public class RunFormBiodata {
    public static void main(String[] args) {
        JFrame x = new JFrame("Formulir Biodata Mahasiswa");
        x.setContentPane(new FormBiodata().getRootPanel());
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setLocationRelativeTo(null);
        x.setSize(600,500);
        x.setVisible(true);
    }
}
