package com.company;
import  java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mark[] tm = new Mark[3];
        Mark[] tm1 = new Mark[3];
        Mark[] tm2 = new Mark[3];
        tm[0] = new Mark(15,"Math"  );
        tm[1] = new Mark(15,"Combi"  );
        tm[2] = new Mark(13,"Anglais"  );
        tm1[0] = new Mark(8,"Math"  );
        tm1[1] = new Mark(9,"Combi"  );
        tm1[2] = new Mark(10,"Anglais"  );
        tm2[0] = new Mark(13,"Math"  );
        tm2[1] = new Mark(12,"Combi"  );
        tm2[2] = new Mark(19,"Anglais"  );
        Student[] TS1 = new Student[3];
        TS1[0] = new Student( "RENOIR","Marvin",21,tm );
        TS1[1] = new Student( "LB","BLY",21,tm1 );
        TS1[2] = new Student( "LBQ","BLYA",22,tm2 );
        Application a1 = new Application( "Myges",TS1 );
        a1.add( 0,"Reseau",18 );
        a1.printArray(a1.avgs());
        a1.print();

    }
}
