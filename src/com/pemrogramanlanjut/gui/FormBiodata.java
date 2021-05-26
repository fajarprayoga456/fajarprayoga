package com.pemrogramanlanjut.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JTextField textJenjang;
    private JTextField textMasuk;
    private JTextField textFakultas;
    private JTextField textJurusan;
    private JTextField textJenis;
    private JTextField textUrut;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String nama = textNama.getText();
               String nim = textNim.getText();
               String jenjang = textJenjang.getText();
               String masuk = textMasuk.getText();
               String fakultas = textFakultas.getText();
               String jurusan = textJurusan.getText();
               String jenis = textJenis.getText();
               String urut = textUrut.getText();

               Mahasiswa std = new Mahasiswa();
               std.setNama(nama);
               std.setNim(nim);
               std.setJenjang(jenjang);
               std.setMasuk(masuk);
               std.setFakultas(fakultas);
               std.setJurusan(jurusan);
               std.setJenis(jenis);
               std.setUrut(urut);

               System.out.println(std.toString());

               labelHasil.setText(std.toString());

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
