package com.javacze.notatnik.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.javacze.notatnik.narzedzia.Pliki;

public class PanelGui extends JPanel {

    public PanelGui() {
        //Ustawiamy layout panelu na taki który ma 5 sekcji NORTH, EAST, CENTER, WEST, SOUTH
        setLayout(new BorderLayout());
        //Tworzymy panel guzików
        JPanel buttonPanel = new JPanel();
        //Ustawiamy panelowi layout na taki który renderuje elementy obok siebie
        // w poziomie
        buttonPanel.setLayout(new FlowLayout());

        //Tworzymy przycisk 'Zapisz'
        JButton zapisz = new JButton("Zapisz");
        //Tworzymy przycisk 'Odczytaj'
        JButton wczytaj = new JButton("Odczytaj");

        //Tworzymy element textArea o wymiarach 10 wierszy na 50 kolumn
        JTextArea textArea = new JTextArea(10, 50);
        //Włączamy zawijanie zawijanie linii
        textArea.setLineWrap(true);
        //scrollPane spowoduje że w momencie wpisania tekstu większego
        //niż obszar textArea, pojawi się scroll bar
        JScrollPane scrollPane = new JScrollPane(textArea);

        //Określamy jaka akcja ma się zadziać w momencie wciśnięcia przycisku wczytaj
        wczytaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Tworzymy obiekt fileChoosera
                JFileChooser jfc = new JFileChooser();
                //W momencie wywołania następującej linii na ekranie pokaże się
                //okienko dialogowe służace do wyboru pliku
                //Gdy wcisniemy 'Open' showOpenDialog zwróci 'APPROVE_OPTION'
                //Gdy wciśniemy 'Cancel' showOpenDialog zwróci 'CANCEL_OPTION'
                int retVal = jfc.showOpenDialog(buttonPanel);
                //Jeśli wcisnęliśmy 'Open' wykona się kod w if'ie
                if(retVal == JFileChooser.APPROVE_OPTION) {
                    File plik = jfc.getSelectedFile(); //Pobieramy plik wybrany w okienku dialogowym
                    String zawartoscText = Pliki.wczytaj(plik.getAbsolutePath()); //Wczytujemy zawartość pliku
                    textArea.setText(zawartoscText); //Ustawiamy zawartość pliku jako tekst w oknie notatnika
                }
            }
        });

        //Określamy jaka akcja ma się zadziać w momencie wciśnięcia przycisku wczytaj
        zapisz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Tworzymy obiekt fileChoosera
                JFileChooser jfc = new JFileChooser();
                //W momencie wywołania następującej linii na ekranie pokaże się
                //okienko dialogowe służace do wyboru pliku
                //Gdy wcisniemy 'Save' showOpenDialog zwróci 'APPROVE_OPTION'
                //Gdy wciśniemy 'Cancel' showOpenDialog zwróci 'CANCEL_OPTION'
                int retVal = jfc.showSaveDialog(buttonPanel);
                if(retVal == JFileChooser.APPROVE_OPTION) {
                    File plik = jfc.getSelectedFile();//Pobieramy zaznaczony w oknie dialogowym plik
                    //Dokonujemy formatowania znaków końca linii, powyższa operacja wymagana tylko
                    //na Windows'ie
                    String sformatowany = textArea.getText().replaceAll("\\r", "");
                    sformatowany = sformatowany.replaceAll("\\n", "\r\n");
                    //Zapisujemy skonwertowaną zawartość do pliku
                    Pliki.zapiszDoPliku(plik.getAbsolutePath(), sformatowany);
                }
            }
        });

        buttonPanel.add(zapisz); //Dodajemy guzik zapisz do panelu guzików
        buttonPanel.add(wczytaj);//Dodajemy wczytaj zapisz do panelu guzików

        add(buttonPanel, BorderLayout.NORTH); //Dodajemy panel guzików do północnej części layout panelu głównego
        add(scrollPane, BorderLayout.CENTER); //scrollPane z textArea dodajemy do centralnej części panelu głównego
    }




}
