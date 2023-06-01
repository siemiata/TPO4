package com.example.tpo4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        String nazwaPliku = "nowyPlik.txt";

        File plik = new File(nazwaPliku);

        if (!plik.exists()) {
            try {
                plik.createNewFile();
                System.out.println("Utworzono nowy plik: " + plik.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Wystąpił błąd podczas tworzenia pliku: " + e.getMessage());
            }
        } else {
            System.out.println("Plik już istnieje: " + plik.getAbsolutePath());
        }
    }
}
