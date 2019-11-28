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
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
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
        result /= count;
        return result;
    }

    public Integer getScore(HashMap student, String mail) {
        return (Integer) student.get(mail);
    }
}
