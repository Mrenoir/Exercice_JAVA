package com.company;

import java.io.IOException;
import java.util.HashMap;

public class Main {

    public  static void main(String [] args ) throws IOException {
        HashMap map = new HashMap<>();
        FicReader fc = new FicReader();
        map = fc.ReadFic();
        System.out.print("Voici le score de l'etudiant marvin@gmail.com  " + fc.getScore(map, "marvin@gmail.com") + "\n");
        System.out.print("Moyenne des scores : " + fc.getAverage(map));
    }
}
