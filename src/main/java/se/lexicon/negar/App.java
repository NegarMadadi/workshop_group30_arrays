package se.lexicon.negar;


import se.lexicon.negar.data.NamesStorage;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        NamesStorage.add("Negar Madadi");
        NamesStorage.add("Negar Nazari");
        NamesStorage.add("Saba Nouri");

        String[] negars = NamesStorage.findByFirstName("saba");
        System.out.println(Arrays.toString(negars));
    }
}