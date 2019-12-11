package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class FicReader {

    public FicReader() {

    }

    public HashMap ReadFic() throws IOException {
        HashMap<String,Integer>  ficContent = new HashMap<>() ;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));

        } catch (Error e) {
            System.out.print("Merci de créer le fichier");
        }
        String line = null;
        while((line = reader.readLine()) != null){
            String[] lineTab = line.split(":");
            Integer score = Integer.parseInt(lineTab[1]);
            ficContent.put(lineTab[0],score) ;
            //       System.out.print("Score : " +  ficContent.get(lineTab[0]) + "\n");

        }
        return  ficContent;
    }

    public double getAverage(HashMap scoreStock) {
        double result = 0;
        int count = 0;
        Collection values = scoreStock.values();
        ArrayList<Integer> ListOfScores = new ArrayList<Integer>(values);
        for (Integer value : ListOfScores) {
            result += value;
            count++;
        }
        try {
            result /= count;
        }
        catch(Exeception e) {

            return  result;
        }
        return result;
    }

    public Integer getScore(HashMap student, String mail) {
        if (student.get(mail) != null) {
            System.out.print("Le score de l'étudiant avec le mail : " + mail + " est de : " + student.get(mail) + " \n");
            return (Integer) student.get(mail);
        }
        System.out.print("Il n'y a aucun étudiant avec l'adresse mail :  " + mail + "\n");
        return 0;
    }
}
