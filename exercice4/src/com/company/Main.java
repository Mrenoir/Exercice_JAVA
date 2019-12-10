package com.company;

public class Main {

    public static void main( String[] args ) {
        String s = "abcdefg abcdef /a cab";
        Boolean ok ;
        String[] str = s.split( " " );
        System.out.println( str[0] );
        System.out.println( str[1] );
        System.out.println( checkString( str[0] , str[1] ) );
        System.out.println( leftRotate( str[1] , 3 ) );
        if (str.length > 3) {
            System.out.println( checkString( str[0] , str[3] ) );
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
