package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int arg = Integer.parseInt( args[0] );
        while (i != arg){
            De d1 = new De();
            De d2 = new De();
            d1.launchDe();
            d2.launchDe();
            System.out.print( "Lance numéro : " + (i+1) +" Valeur du dé 1 : "+ d1.getValue() );
            System.out.println(" Valeur du dé 2 : "+ d2.getValue() );
            if (( d1.getValue( ) == d2.getValue( ) )) {
                System.out.println( "Vous avez gagné" );
            } else {
                System.out.println( "Vous avez perdu" );
            }
            i++;
        }
    }
}
