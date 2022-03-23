package se.lexicon.negar;


import se.lexicon.negar.data.NamesStorage;

import javax.sound.midi.Soundbank;

public class App
{
    public static void main( String[] args ) {
        boolean added = (NamesStorage.add("Negar Madadi"));
        if (added){
            System.out.println("A name was added.");
        }
        added = NamesStorage.add("Negar Madadi");
        if (added){
            System.out.println("A name was added.");
        }else {
            System.out.println("Name already exists.");
        }
        System.out.println(NamesStorage.add(null));
    }

}
