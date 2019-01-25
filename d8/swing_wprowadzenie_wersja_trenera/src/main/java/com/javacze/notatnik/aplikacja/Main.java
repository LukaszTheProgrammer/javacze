package com.javacze.notatnik.aplikacja;

import javax.swing.JFrame;

import com.javacze.notatnik.gui.PanelGui;

public class Main {

    public static void main(String[] args) {
        //tworzymy obiekt reprezentujący nowe okno
        JFrame jFrame = new JFrame();
        //Ustawia domyślną akcję przy wciśnięciu przycisku zamykającego okno
        //EXIT_ON_CLOSE mówi że program ma się zakończyć
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //do okna dodajemy panel z naszym interfejsem graficznym
        jFrame.add(new PanelGui());
        //Ustawiamy początkowy rozmiar okna
        jFrame.setSize(800,600);
        //Okienko będzie pojawiać się przesunięte o 100,100 pikseli względem lewego górnego rogu
        jFrame.setLocation(100,100);
        //Pokazujemy okno, WAŻNE aby dodać własne elementy przed setVisible(true);
        jFrame.setVisible(true);
    }
}
