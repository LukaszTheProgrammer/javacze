package com.javacze.notatnik.narzedzia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pliki {

    public static void zapiszDoPliku(String nazwaPliku, String text) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(nazwaPliku, false);
        } catch (IOException e) {
            e.printStackTrace();
            return; //jeśli wystąpił błąd przy zapisie do pliku drukujemy jego zawartość
            //na konsoli a następnie wychodzimy z funkcji nie zapisując nic
            //dla usprawnienia programu możnaby przerzucać wyjątek do PaneluGui
            // i tam go obsługiwać aby wyświetlać komunikat błędu w oknie dialogowym
            //zamiast w konsoli. Wtedy od razu będzie się rzucało w oczy że wystąpił błąd
        }
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        printWriter.print(text);//piszemy do pliku
        printWriter.close();
    }

    public static String wczytaj(String nazwaPliku) {
        File plik = new File(nazwaPliku);
        Scanner scanner = null;
        try {
            scanner = new Scanner(plik);
        } catch (FileNotFoundException e) {
            return ""; //Jeśli nie uda się otworzyć pliku do odczytu zwracamy pusty tekst,
            //dla usprawnienia programu możnaby przerzucać wyjątek do PaneluGui
            // i tam go obsługiwać aby wyświetlać komunikat błędu w oknie dialogowym
            //zamiast w konsoli. Wtedy od razu będzie się rzucało w oczy że wystąpił błąd
        }

        String zawartosc = "";
        while (scanner.hasNext()) {
            zawartosc += scanner.nextLine() + "\n"; //Czytamy plik linia po linii
        }

        return zawartosc;
    }
}
