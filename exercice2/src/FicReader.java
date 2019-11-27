import org.jetbrains.annotations.Contract;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FicReader {

    public  FicReader() {

    }
    public HashMap ReadFic(String ficName) throws IOException {
        HashMap<String,Integer>  ficContent = new HashMap<>() ;
        BufferedReader reader = new BufferedReader(new FileReader(ficName));
        String line = null;
        while((line = reader.readLine()) != null){
            String[] lineTab = line.split(":");
            Integer score = Integer.parseInt(lineTab[1]);
            ficContent.put(lineTab[0],score) ;
            System.out.print(ficContent.get(lineTab[0]));
        }
        return  ficContent;
    }
}
