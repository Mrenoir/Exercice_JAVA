package com.company;
import java.util.Random;

public class De {
    private int value;

    public void launchDe(){
        Random rand = new Random(  );
        this.value = rand.nextInt(7) + 1;
    }

    public int getValue() {
        return value;
    }
}
