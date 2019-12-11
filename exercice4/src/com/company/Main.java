package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main( String[] args ) {
        String s = "abcdefg abcdef /a abcdef";
        Boolean ok ;
        String[] str = s.split( " " );
        System.out.println( str[0] );
        System.out.println( str[1] );
        System.out.println( checkString( str[0] , str[1] ) );
        System.out.println( leftRotate( str[1] , 3 ) );
        if (str.length > 3) {
            System.out.println( checkAna( str[1] , str[3] ) );
        }
    }
    public static boolean checkString( String alpha , String str ) {
        int i = 0;
        while (i != str.length( )) {
            String c = str.substring( i , i + 1 );
            if (!alpha.contains( c )) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean checkAna( String string , String ana ) {
        char [] charString =  string.toCharArray();
        char [] charAna = ana.toCharArray();
        Arrays.sort(charAna);
        Arrays.sort( charString);
        return Arrays.equals( charAna , charString );
    }
    public static HashMap<Character,Integer> arrayToHash(char [] array)
    {
        HashMap<Character,Integer> map = new HashMap<>(  );
        for ( char c : array ) {
           if( map.get( c ) != null)
           {
               Integer i = map.get( c );
               i++;
               map.put( c,i );
           }
           else{
               map.put( c,0 );
           }
        }
        return  map;
    }
    public static String leftRotate( String str , int n ) {
        String strRotate;
        String partOne = str.substring( n , str.length( ) );
        String partTwo = str.substring( 0 , n );
        strRotate = partOne + partTwo;
        return strRotate;
    }
    public static String rightRotate( String str , int n ) {
        String strRotate;
        String partOne = str.substring( n , str.length( ) );
        String partTwo = str.substring( 0 , n );
        strRotate = partTwo + partOne;
        return strRotate;
    }

}
