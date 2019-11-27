import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public  static void main() throws IOException {
       // BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        FicReader fc = new FicReader();
        fc.ReadFic("test.txt");
    }
}
