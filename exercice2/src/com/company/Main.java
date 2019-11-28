package com.company;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public  static void main(String [] args ) throws IOException {
        HashMap map = new HashMap<>();
        FicReader fc = new FicReader();
        Scanner sc = new Scanner(System.in);
        Instant start = Instant.now();
        map = fc.ReadFic();
        // String mail = "marvin@gmail.com";
        String mail = sc.nextLine();
        fc.getScore(map, mail);
        System.out.print("Moyenne des scores : " + fc.getAverage(map));
        Duration duration = Duration.between(start, Instant.now());
        System.out.print(" \n ùTemps d'execution : " + duration.getSeconds() + " secondes ");
    }
}
