package com.company;

import java.io.IOException;

public class Main {

    public  static void main(String [] args ) throws IOException {
        FicReader fc = new FicReader();
        fc.ReadFic("test.txt");
    }
}
