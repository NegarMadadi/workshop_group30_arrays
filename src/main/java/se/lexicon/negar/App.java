package se.lexicon.negar;


import se.lexicon.negar.data.NamesStorage;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        NamesStorage.add("Negar Madadi");
        NamesStorage.add("Negar Nazari");
        NamesStorage.add("Saba Nouri");

        NamesStorage.remove("Negar MAdadi");

        System.out.println(NamesStorage.nameExist("negar Madadi"));
    }
}